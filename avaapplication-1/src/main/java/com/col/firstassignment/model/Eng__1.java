
package com.col.firstassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "f",
    "m"
})
@Generated("jsonschema2pojo")
public class Eng__1 {

    @JsonProperty("f")
    public String f;
    @JsonProperty("m")
    public String m;

}
