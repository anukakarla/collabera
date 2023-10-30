
package com.col.firstassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "common",
    "official",
    "nativeName"
})
@Generated("jsonschema2pojo")
public class Name {

    @JsonProperty("common")
    public String common;
    @JsonProperty("official")
    public String official;
    @JsonProperty("nativeName")
    public NativeName nativeName;

}
