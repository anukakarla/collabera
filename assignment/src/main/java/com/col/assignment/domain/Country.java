
package com.col.assignment.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.col.assignment.model.Response;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "tld",
    "cca2",
    "ccn3",
    "cca3",
    "cioc",
    "independent",
    "status",
    "unMember",
    "currencies",
    "idd",
    "capital",
    "altSpellings",
    "region",
    "subregion",
    "languages",
    "translations",
    "latlng",
    "landlocked",
    "area",
    "demonyms",
    "flag",
    "maps",
    "population",
    "gini",
    "fifa",
    "car",
    "timezones",
    "continents",
    "flags"
})
@Data
@JsonFilter("getCountry")
@Generated("jsonschema2pojo")
public class Country {

    @JsonProperty("name")
    public Name name;
    @JsonProperty("tld")
    public List<String> tld = null;
    @JsonProperty("cca2")
    public String cca2;
    @JsonProperty("ccn3")
    public String ccn3;
    @JsonProperty("cca3")
    public String cca3;
    @JsonProperty("cioc")
    public String cioc;
    @JsonProperty("independent")
    public Boolean independent;
    @JsonProperty("status")
    public String status;
    @JsonProperty("unMember")
    public Boolean unMember;
    @JsonProperty("currencies")
    public Currencies currencies;
    @JsonProperty("idd")
    public Idd idd;
    @JsonProperty("capital")
    public List<String> capital = null;
    @JsonProperty("altSpellings")
    public List<String> altSpellings = null;
    @JsonProperty("region")
    public String region;
    @JsonProperty("subregion")
    public String subregion;
    @JsonProperty("languages")
    public Languages languages;
    @JsonProperty("translations")
    public Translations translations;
    @JsonProperty("latlng")
    public List<Float> latlng = null;
    @JsonProperty("landlocked")
    public Boolean landlocked;
    @JsonProperty("area")
    public Float area;
    @JsonProperty("demonyms")
    public Demonyms demonyms;
    @JsonProperty("flag")
    public String flag;
    @JsonProperty("maps")
    public Maps maps;
    @JsonProperty("population")
    public Integer population;
    @JsonProperty("gini")
    public Gini gini;
    @JsonProperty("fifa")
    public String fifa;
    @JsonProperty("car")
    public Car car;
    @JsonProperty("timezones")
    public List<String> timezones = null;
    @JsonProperty("continents")
    public List<String> continents = null;
    @JsonProperty("flags")
    public List<String> flags = null;
    
    public Response response;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
