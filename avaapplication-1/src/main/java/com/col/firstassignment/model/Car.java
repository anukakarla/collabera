
package com.col.firstassignment.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "signs",
    "side"
})
@Generated("jsonschema2pojo")
public class Car {

    @JsonProperty("signs")
    public List<String> signs = null;
    @JsonProperty("side")
    public String side;

}
