package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DatasetStats;
import java.util.ArrayList;
import java.util.List;


/**
 * Basic statistics PRIDE Proteomes data
 */
@ApiModel(description = "Basic statistics PRIDE Proteomes data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class Statistics   {
  
  private Integer speciesCount = null;
  private List<DatasetStats> datasetStatistics = new ArrayList<DatasetStats>();

  
  /**
   * total species (e.g. dataset) count in Proteomes
   **/
  public Statistics speciesCount(Integer speciesCount) {
    this.speciesCount = speciesCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "total species (e.g. dataset) count in Proteomes")
  @JsonProperty("speciesCount")
  public Integer getSpeciesCount() {
    return speciesCount;
  }
  public void setSpeciesCount(Integer speciesCount) {
    this.speciesCount = speciesCount;
  }


  /**
   * list of statistics for each species (e.g. dataset)
   **/
  public Statistics datasetStatistics(List<DatasetStats> datasetStatistics) {
    this.datasetStatistics = datasetStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "list of statistics for each species (e.g. dataset)")
  @JsonProperty("datasetStatistics")
  public List<DatasetStats> getDatasetStatistics() {
    return datasetStatistics;
  }
  public void setDatasetStatistics(List<DatasetStats> datasetStatistics) {
    this.datasetStatistics = datasetStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistics statistics = (Statistics) o;
    return Objects.equals(this.speciesCount, statistics.speciesCount) &&
        Objects.equals(this.datasetStatistics, statistics.datasetStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speciesCount, datasetStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistics {\n");
    
    sb.append("    speciesCount: ").append(toIndentedString(speciesCount)).append("\n");
    sb.append("    datasetStatistics: ").append(toIndentedString(datasetStatistics)).append("\n");
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

