
package com.col.firstassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "official",
    "common"
})
@Generated("jsonschema2pojo")
public class Rus {

    @JsonProperty("official")
    public String official;
    @JsonProperty("common")
    public String common;

}
