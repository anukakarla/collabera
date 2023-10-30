
package com.col.firstassignment.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "root",
    "suffixes"
})
@Generated("jsonschema2pojo")
public class Idd {

    @JsonProperty("root")
    public String root;
    @JsonProperty("suffixes")
    public List<String> suffixes = null;

}
