package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Peptide;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class PeptideList   {
  
  private List<Peptide> peptideList = new ArrayList<Peptide>();

  
  /**
   **/
  public PeptideList peptideList(List<Peptide> peptideList) {
    this.peptideList = peptideList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peptideList")
  public List<Peptide> getPeptideList() {
    return peptideList;
  }
  public void setPeptideList(List<Peptide> peptideList) {
    this.peptideList = peptideList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeptideList peptideList = (PeptideList) o;
    return Objects.equals(this.peptideList, peptideList.peptideList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peptideList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeptideList {\n");
    
    sb.append("    peptideList: ").append(toIndentedString(peptideList)).append("\n");
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

