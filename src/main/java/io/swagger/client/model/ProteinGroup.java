package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EntrystringSetstring;
import java.util.ArrayList;
import java.util.List;


/**
 * A protein group (for example proteins grouped by gene)
 */
@ApiModel(description = "A protein group (for example proteins grouped by gene)")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class ProteinGroup   {
  
  private String id = null;
  private String description = null;
  private List<String> tissues = new ArrayList<String>();
  private List<String> memberProteins = new ArrayList<String>();
  private Integer taxonID = null;
  private List<EntrystringSetstring> uniquePeptides = new ArrayList<EntrystringSetstring>();

  
  /**
   **/
  public ProteinGroup id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * a description for the group
   **/
  public ProteinGroup description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a description for the group")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * a list of tissues (aggregated from the proteins/peptides associated to this group)
   **/
  public ProteinGroup tissues(List<String> tissues) {
    this.tissues = tissues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of tissues (aggregated from the proteins/peptides associated to this group)")
  @JsonProperty("tissues")
  public List<String> getTissues() {
    return tissues;
  }
  public void setTissues(List<String> tissues) {
    this.tissues = tissues;
  }


  /**
   * the proteins belonging to this group
   **/
  public ProteinGroup memberProteins(List<String> memberProteins) {
    this.memberProteins = memberProteins;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the proteins belonging to this group")
  @JsonProperty("memberProteins")
  public List<String> getMemberProteins() {
    return memberProteins;
  }
  public void setMemberProteins(List<String> memberProteins) {
    this.memberProteins = memberProteins;
  }


  /**
   * the species for this group (taxon id)
   **/
  public ProteinGroup taxonID(Integer taxonID) {
    this.taxonID = taxonID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the species for this group (taxon id)")
  @JsonProperty("taxonID")
  public Integer getTaxonID() {
    return taxonID;
  }
  public void setTaxonID(Integer taxonID) {
    this.taxonID = taxonID;
  }


  /**
   * peptides unique to this group (not necessarily unique to a single protein!)
   **/
  public ProteinGroup uniquePeptides(List<EntrystringSetstring> uniquePeptides) {
    this.uniquePeptides = uniquePeptides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "peptides unique to this group (not necessarily unique to a single protein!)")
  @JsonProperty("uniquePeptides")
  public List<EntrystringSetstring> getUniquePeptides() {
    return uniquePeptides;
  }
  public void setUniquePeptides(List<EntrystringSetstring> uniquePeptides) {
    this.uniquePeptides = uniquePeptides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProteinGroup proteinGroup = (ProteinGroup) o;
    return Objects.equals(this.id, proteinGroup.id) &&
        Objects.equals(this.description, proteinGroup.description) &&
        Objects.equals(this.tissues, proteinGroup.tissues) &&
        Objects.equals(this.memberProteins, proteinGroup.memberProteins) &&
        Objects.equals(this.taxonID, proteinGroup.taxonID) &&
        Objects.equals(this.uniquePeptides, proteinGroup.uniquePeptides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, tissues, memberProteins, taxonID, uniquePeptides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProteinGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tissues: ").append(toIndentedString(tissues)).append("\n");
    sb.append("    memberProteins: ").append(toIndentedString(memberProteins)).append("\n");
    sb.append("    taxonID: ").append(toIndentedString(taxonID)).append("\n");
    sb.append("    uniquePeptides: ").append(toIndentedString(uniquePeptides)).append("\n");
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

