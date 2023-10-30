
package com.col.firstassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "googleMaps",
    "openStreetMaps"
})
@Generated("jsonschema2pojo")
public class Maps {

    @JsonProperty("googleMaps")
    public String googleMaps;
    @JsonProperty("openStreetMaps")
    public String openStreetMaps;

}
