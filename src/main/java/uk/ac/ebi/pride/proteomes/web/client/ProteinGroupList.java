package uk.ac.ebi.pride.proteomes.web.client;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.ac.ebi.pride.proteomes.web.client.ProteinGroup;


/**
 * ProteinGroupList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class ProteinGroupList   {
  
  private List<ProteinGroup> proteinGroupList = new ArrayList<ProteinGroup>();

  
  /**
   **/
  public ProteinGroupList proteinGroupList(List<ProteinGroup> proteinGroupList) {
    this.proteinGroupList = proteinGroupList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proteinGroupList")
  public List<ProteinGroup> getProteinGroupList() {
    return proteinGroupList;
  }
  public void setProteinGroupList(List<ProteinGroup> proteinGroupList) {
    this.proteinGroupList = proteinGroupList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProteinGroupList proteinGroupList = (ProteinGroupList) o;
    return Objects.equals(this.proteinGroupList, proteinGroupList.proteinGroupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proteinGroupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProteinGroupList {\n");
    
    sb.append("    proteinGroupList: ").append(toIndentedString(proteinGroupList)).append("\n");
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

