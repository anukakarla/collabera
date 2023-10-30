package com.col.busmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.col.busmanagement.beans.Bus;
import com.col.busmanagement.beans.BusResponse;
import com.col.busmanagement.beans.BusWoOwnerDetails;
import com.col.busmanagement.beans.OwnerDetails;
import com.col.busmanagement.beans.OwnerResponse;
import com.col.busmanagement.jwtutil.JwtUtil;
import com.col.busmanagement.request.OwnerRequest;
import com.col.busmanagement.service.OwnerDetailsService;

@RestController
public class OwnerDetailsController {
	@Autowired
	private OwnerDetailsService detailsService;
	@Autowired
	private AuthenticationManager manager;
	@Autowired
	private UserDetailsService service;
	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/adminsignup")
	public ResponseEntity<?> ownerAdmin(@RequestBody OwnerDetails details) {
		OwnerDetails details2 = detailsService.save(details);
		if (details2 != null) {
			return ResponseEntity.ok(new OwnerResponse("username already exists", true, null,null));

			
		} else {
			manager.authenticate(
					new UsernamePasswordAuthenticationToken(details2.getUsername(), details2.getPassword()));
			UserDetails userDetails = service.loadUserByUsername(details2.getUsername());
			return ResponseEntity.ok(new OwnerResponse("sign in is done", false, null,null));

		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody OwnerRequest request, String role) {
		try {
			manager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		} catch (AuthenticationException e) {
			return ResponseEntity.ok(new OwnerResponse("invalid username and password", true, null,null));
		}
		UserDetails details = service.loadUserByUsername(request.getUsername());
		OwnerDetails findRole = detailsService.getRole1(details.getUsername());
		 String  jwtToken=jwtUtil.generateToken(details);
		return ResponseEntity.ok(new OwnerResponse("Authentication success", false, jwtToken,findRole.getRole()));

	}

	@PostMapping("/addbus")
	public ResponseEntity<?> addDetails(@RequestBody Bus bus) {
		try {
			detailsService.addBus(bus);
			return new ResponseEntity<String>("Data Added Successfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

//	@GetMapping("/getAll")
//	public Object getAll() {
//
//		BusResponse busResponse = null;
//
//		try {
//			List<Bus> bus = detailsService.getAll();
//			busResponse = new BusResponse("success", bus, 200, "got details");
//
//		} catch (Exception e) {
//			busResponse.setMessage("Fail");
//			busResponse.setResponse(400);
//			busResponse.setDescription("Data not found");
//
//		}
//		return busResponse;
//
//	}

	@DeleteMapping("/deletebus/{busId}")
	public ResponseEntity<?> deleteDetails(@PathVariable int busId) {
		try {
			detailsService.deleteBus(busId);
			return new ResponseEntity<String>("Deleted Data Successfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/bus/{ownerId}")
	public ResponseEntity<?> getAllDetails(@PathVariable int ownerId) {
		List<BusWoOwnerDetails> bus = detailsService.getAllWo(ownerId);
		if (bus != null) {
			return new ResponseEntity<List<BusWoOwnerDetails>>(bus, HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("went wrong", HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	@PutMapping("/updatebus/{busId}")
	public ResponseEntity<?> updatebus(@RequestBody Bus bus, @PathVariable int busId) {

		try {
			bus.setBusId(busId);
			detailsService.updateBus(bus);
			return new ResponseEntity<String>("updated Successfully", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
//	@GetMapping("/sd")
//	public ResponseEntity<?> getSd(@RequestBody BusWoOwnerDetails details) {
//		try {
//			List<BusWoOwnerDetails>  busWoOwnerDetails=detailsService.place(details);
//			return new ResponseEntity<List<BusWoOwnerDetails>>(busWoOwnerDetails,HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<String>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
//
//		}
//		
//	}
}
