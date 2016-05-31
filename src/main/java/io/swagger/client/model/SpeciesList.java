package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class SpeciesList   {
  
  private List<String> speciesList = new ArrayList<String>();

  
  /**
   **/
  public SpeciesList speciesList(List<String> speciesList) {
    this.speciesList = speciesList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("speciesList")
  public List<String> getSpeciesList() {
    return speciesList;
  }
  public void setSpeciesList(List<String> speciesList) {
    this.speciesList = speciesList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeciesList speciesList = (SpeciesList) o;
    return Objects.equals(this.speciesList, speciesList.speciesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speciesList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeciesList {\n");
    
    sb.append("    speciesList: ").append(toIndentedString(speciesList)).append("\n");
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

