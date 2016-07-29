package uk.ac.ebi.pride.proteomes.web.client;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.ac.ebi.pride.proteomes.web.client.Protein;


/**
 * ProteinList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class ProteinList   {
  
  private List<Protein> proteinList = new ArrayList<Protein>();

  
  /**
   **/
  public ProteinList proteinList(List<Protein> proteinList) {
    this.proteinList = proteinList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proteinList")
  public List<Protein> getProteinList() {
    return proteinList;
  }
  public void setProteinList(List<Protein> proteinList) {
    this.proteinList = proteinList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProteinList proteinList = (ProteinList) o;
    return Objects.equals(this.proteinList, proteinList.proteinList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proteinList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProteinList {\n");
    
    sb.append("    proteinList: ").append(toIndentedString(proteinList)).append("\n");
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

