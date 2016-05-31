package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Basic statistics about a dataset (e.g. per species)
 */
@ApiModel(description = "Basic statistics about a dataset (e.g. per species)")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class DatasetStats   {
  
  private String commonName = null;
  private Integer taxid = null;
  private Long peptiformCount = null;
  private Long mappedProteinCount = null;
  private Long mappedGeneGroupCount = null;
  private Long totalProteinCount = null;
  private Long totalGeneGroupCount = null;
  private String scientificName = null;

  
  /**
   * common species name
   **/
  public DatasetStats commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "common species name")
  @JsonProperty("commonName")
  public String getCommonName() {
    return commonName;
  }
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }


  /**
   * species taxon id defining the dataset (1 = all species)
   **/
  public DatasetStats taxid(Integer taxid) {
    this.taxid = taxid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "species taxon id defining the dataset (1 = all species)")
  @JsonProperty("taxid")
  public Integer getTaxid() {
    return taxid;
  }
  public void setTaxid(Integer taxid) {
    this.taxid = taxid;
  }


  /**
   * number of peptiforms in the dataset
   **/
  public DatasetStats peptiformCount(Long peptiformCount) {
    this.peptiformCount = peptiformCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of peptiforms in the dataset")
  @JsonProperty("peptiformCount")
  public Long getPeptiformCount() {
    return peptiformCount;
  }
  public void setPeptiformCount(Long peptiformCount) {
    this.peptiformCount = peptiformCount;
  }


  /**
   * number of mapped proteins in the dataset
   **/
  public DatasetStats mappedProteinCount(Long mappedProteinCount) {
    this.mappedProteinCount = mappedProteinCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of mapped proteins in the dataset")
  @JsonProperty("mappedProteinCount")
  public Long getMappedProteinCount() {
    return mappedProteinCount;
  }
  public void setMappedProteinCount(Long mappedProteinCount) {
    this.mappedProteinCount = mappedProteinCount;
  }


  /**
   * number of mapped gene groups in the dataset
   **/
  public DatasetStats mappedGeneGroupCount(Long mappedGeneGroupCount) {
    this.mappedGeneGroupCount = mappedGeneGroupCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of mapped gene groups in the dataset")
  @JsonProperty("mappedGeneGroupCount")
  public Long getMappedGeneGroupCount() {
    return mappedGeneGroupCount;
  }
  public void setMappedGeneGroupCount(Long mappedGeneGroupCount) {
    this.mappedGeneGroupCount = mappedGeneGroupCount;
  }


  /**
   * total of proteins in the dataset
   **/
  public DatasetStats totalProteinCount(Long totalProteinCount) {
    this.totalProteinCount = totalProteinCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "total of proteins in the dataset")
  @JsonProperty("totalProteinCount")
  public Long getTotalProteinCount() {
    return totalProteinCount;
  }
  public void setTotalProteinCount(Long totalProteinCount) {
    this.totalProteinCount = totalProteinCount;
  }


  /**
   * total of gene groups in the dataset
   **/
  public DatasetStats totalGeneGroupCount(Long totalGeneGroupCount) {
    this.totalGeneGroupCount = totalGeneGroupCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "total of gene groups in the dataset")
  @JsonProperty("totalGeneGroupCount")
  public Long getTotalGeneGroupCount() {
    return totalGeneGroupCount;
  }
  public void setTotalGeneGroupCount(Long totalGeneGroupCount) {
    this.totalGeneGroupCount = totalGeneGroupCount;
  }


  /**
   * scientific species name
   **/
  public DatasetStats scientificName(String scientificName) {
    this.scientificName = scientificName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "scientific species name")
  @JsonProperty("scientificName")
  public String getScientificName() {
    return scientificName;
  }
  public void setScientificName(String scientificName) {
    this.scientificName = scientificName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetStats datasetStats = (DatasetStats) o;
    return Objects.equals(this.commonName, datasetStats.commonName) &&
        Objects.equals(this.taxid, datasetStats.taxid) &&
        Objects.equals(this.peptiformCount, datasetStats.peptiformCount) &&
        Objects.equals(this.mappedProteinCount, datasetStats.mappedProteinCount) &&
        Objects.equals(this.mappedGeneGroupCount, datasetStats.mappedGeneGroupCount) &&
        Objects.equals(this.totalProteinCount, datasetStats.totalProteinCount) &&
        Objects.equals(this.totalGeneGroupCount, datasetStats.totalGeneGroupCount) &&
        Objects.equals(this.scientificName, datasetStats.scientificName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, taxid, peptiformCount, mappedProteinCount, mappedGeneGroupCount, totalProteinCount, totalGeneGroupCount, scientificName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetStats {\n");
    
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    taxid: ").append(toIndentedString(taxid)).append("\n");
    sb.append("    peptiformCount: ").append(toIndentedString(peptiformCount)).append("\n");
    sb.append("    mappedProteinCount: ").append(toIndentedString(mappedProteinCount)).append("\n");
    sb.append("    mappedGeneGroupCount: ").append(toIndentedString(mappedGeneGroupCount)).append("\n");
    sb.append("    totalProteinCount: ").append(toIndentedString(totalProteinCount)).append("\n");
    sb.append("    totalGeneGroupCount: ").append(toIndentedString(totalGeneGroupCount)).append("\n");
    sb.append("    scientificName: ").append(toIndentedString(scientificName)).append("\n");
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

