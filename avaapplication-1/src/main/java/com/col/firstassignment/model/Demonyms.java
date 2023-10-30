
package com.col.firstassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eng",
    "fra"
})
@Generated("jsonschema2pojo")
public class Demonyms {

    @JsonProperty("eng")
    public Eng__1 eng;
    @JsonProperty("fra")
    public Fra__1 fra;

}
