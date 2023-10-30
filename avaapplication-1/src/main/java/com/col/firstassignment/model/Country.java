
package com.col.firstassignment.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

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

}
