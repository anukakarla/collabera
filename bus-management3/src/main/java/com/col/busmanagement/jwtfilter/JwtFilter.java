package com.col.busmanagement.jwtfilter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.col.busmanagement.jwtutil.JwtUtil;
@Component
public class JwtFilter extends OncePerRequestFilter{
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private UserDetailsService detailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String token=null;
		String ownerUsername=null;
		 String  jwtToken=request.getHeader("Authorization");
		 if (jwtToken!=null && jwtToken.startsWith("Bearer ")) {
			 token=jwtToken.substring(7);
			 System.out.println(token);
			 ownerUsername=jwtUtil.extractUsername(token);
			 
			
		} 
		 
		 if (ownerUsername!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails details=detailsService.loadUserByUsername(ownerUsername);
			if (jwtUtil.validateToken(token, details)) {
				UsernamePasswordAuthenticationToken passwordAuthenticationToken=new UsernamePasswordAuthenticationToken(details.getUsername(), details.getPassword(), details.getAuthorities());
				passwordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(passwordAuthenticationToken);
				
			}
		}
		 filterChain.doFilter(request, response);
		
	}

}
