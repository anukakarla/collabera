
package com.col.assignment.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ara",
    "bre",
    "ces",
    "cym",
    "deu",
    "est",
    "fin",
    "fra",
    "hrv",
    "hun",
    "ita",
    "jpn",
    "kor",
    "nld",
    "per",
    "pol",
    "por",
    "rus",
    "slk",
    "spa",
    "swe",
    "urd",
    "zho"
})
@Generated("jsonschema2pojo")
public class Translations {

    @JsonProperty("ara")
    public Ara ara;
    @JsonProperty("bre")
    public Bre bre;
    @JsonProperty("ces")
    public Ces ces;
    @JsonProperty("cym")
    public Cym cym;
    @JsonProperty("deu")
    public Deu deu;
    @JsonProperty("est")
    public Est est;
    @JsonProperty("fin")
    public Fin fin;
    @JsonProperty("fra")
    public Fra fra;
    @JsonProperty("hrv")
    public Hrv hrv;
    @JsonProperty("hun")
    public Hun hun;
    @JsonProperty("ita")
    public Ita ita;
    @JsonProperty("jpn")
    public Jpn jpn;
    @JsonProperty("kor")
    public Kor kor;
    @JsonProperty("nld")
    public Nld nld;
    @JsonProperty("per")
    public Per per;
    @JsonProperty("pol")
    public Pol pol;
    @JsonProperty("por")
    public Por por;
    @JsonProperty("rus")
    public Rus rus;
    @JsonProperty("slk")
    public Slk slk;
    @JsonProperty("spa")
    public Spa spa;
    @JsonProperty("swe")
    public Swe swe;
    @JsonProperty("urd")
    public Urd urd;
    @JsonProperty("zho")
    public Zho zho;
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
