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
public class TissueList   {
  
  private List<String> tissueList = new ArrayList<String>();

  
  /**
   **/
  public TissueList tissueList(List<String> tissueList) {
    this.tissueList = tissueList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tissueList")
  public List<String> getTissueList() {
    return tissueList;
  }
  public void setTissueList(List<String> tissueList) {
    this.tissueList = tissueList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TissueList tissueList = (TissueList) o;
    return Objects.equals(this.tissueList, tissueList.tissueList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tissueList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TissueList {\n");
    
    sb.append("    tissueList: ").append(toIndentedString(tissueList)).append("\n");
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

