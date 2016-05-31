package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ReleaseSummary;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class ReleaseSummaryList   {
  
  private List<ReleaseSummary> releaseSummaryList = new ArrayList<ReleaseSummary>();

  
  /**
   **/
  public ReleaseSummaryList releaseSummaryList(List<ReleaseSummary> releaseSummaryList) {
    this.releaseSummaryList = releaseSummaryList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("releaseSummaryList")
  public List<ReleaseSummary> getReleaseSummaryList() {
    return releaseSummaryList;
  }
  public void setReleaseSummaryList(List<ReleaseSummary> releaseSummaryList) {
    this.releaseSummaryList = releaseSummaryList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseSummaryList releaseSummaryList = (ReleaseSummaryList) o;
    return Objects.equals(this.releaseSummaryList, releaseSummaryList.releaseSummaryList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseSummaryList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseSummaryList {\n");
    
    sb.append("    releaseSummaryList: ").append(toIndentedString(releaseSummaryList)).append("\n");
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

