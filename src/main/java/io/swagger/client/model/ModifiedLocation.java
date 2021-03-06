package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A localised peptide modification
 */
@ApiModel(description = "A localised peptide modification")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class ModifiedLocation   {
  
  private Integer position = null;
  private String modification = null;

  
  /**
   * the modified sequence position
   **/
  public ModifiedLocation position(Integer position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the modified sequence position")
  @JsonProperty("position")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }


  /**
   * the modification name
   **/
  public ModifiedLocation modification(String modification) {
    this.modification = modification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the modification name")
  @JsonProperty("modification")
  public String getModification() {
    return modification;
  }
  public void setModification(String modification) {
    this.modification = modification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifiedLocation modifiedLocation = (ModifiedLocation) o;
    return Objects.equals(this.position, modifiedLocation.position) &&
        Objects.equals(this.modification, modifiedLocation.modification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, modification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifiedLocation {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    modification: ").append(toIndentedString(modification)).append("\n");
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

