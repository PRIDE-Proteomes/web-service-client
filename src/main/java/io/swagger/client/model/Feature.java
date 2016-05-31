package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Information about a protein feature
 */
@ApiModel(description = "Information about a protein feature")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class Feature   {
  
  private Long id = null;
  private String type = null;
  private Integer end = null;
  private Integer start = null;

  
  /**
   **/
  public Feature id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * type of the feature (e.g. signal peptide, transmembrane regions...)
   **/
  public Feature type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "type of the feature (e.g. signal peptide, transmembrane regions...)")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * the end position of the feature on the mapped protein
   **/
  public Feature end(Integer end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the end position of the feature on the mapped protein")
  @JsonProperty("end")
  public Integer getEnd() {
    return end;
  }
  public void setEnd(Integer end) {
    this.end = end;
  }


  /**
   * the start position of the feature on the mapped protein
   **/
  public Feature start(Integer start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the start position of the feature on the mapped protein")
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.id, feature.id) &&
        Objects.equals(this.type, feature.type) &&
        Objects.equals(this.end, feature.end) &&
        Objects.equals(this.start, feature.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

