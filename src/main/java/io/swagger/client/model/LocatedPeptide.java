package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ModifiedLocation;
import java.util.ArrayList;
import java.util.List;


/**
 * Information about a peptide
 */
@ApiModel(description = "Information about a peptide")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class LocatedPeptide   {
  
  private Integer position = null;
  private Integer uniqueness = null;
  private List<String> sharedProteins = new ArrayList<String>();
  private List<String> sharedGenes = new ArrayList<String>();
  private String id = null;
  private String sequence = null;
  private List<String> assays = new ArrayList<String>();
  private List<String> clusters = new ArrayList<String>();
  private List<String> tissues = new ArrayList<String>();
  private Integer taxonID = null;
  private List<ModifiedLocation> modifiedLocations = new ArrayList<ModifiedLocation>();
  private Boolean symbolic = null;

  
  /**
   * the position of the peptide on the mapped protein
   **/
  public LocatedPeptide position(Integer position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the position of the peptide on the mapped protein")
  @JsonProperty("position")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }


  /**
   * represent the most restricted uniqueness level
   **/
  public LocatedPeptide uniqueness(Integer uniqueness) {
    this.uniqueness = uniqueness;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "represent the most restricted uniqueness level")
  @JsonProperty("uniqueness")
  public Integer getUniqueness() {
    return uniqueness;
  }
  public void setUniqueness(Integer uniqueness) {
    this.uniqueness = uniqueness;
  }


  /**
   * protein accessions shared with this peptide
   **/
  public LocatedPeptide sharedProteins(List<String> sharedProteins) {
    this.sharedProteins = sharedProteins;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "protein accessions shared with this peptide")
  @JsonProperty("sharedProteins")
  public List<String> getSharedProteins() {
    return sharedProteins;
  }
  public void setSharedProteins(List<String> sharedProteins) {
    this.sharedProteins = sharedProteins;
  }


  /**
   * gene accessions shared with this peptide
   **/
  public LocatedPeptide sharedGenes(List<String> sharedGenes) {
    this.sharedGenes = sharedGenes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "gene accessions shared with this peptide")
  @JsonProperty("sharedGenes")
  public List<String> getSharedGenes() {
    return sharedGenes;
  }
  public void setSharedGenes(List<String> sharedGenes) {
    this.sharedGenes = sharedGenes;
  }


  /**
   **/
  public LocatedPeptide id(String id) {
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
   * the peptide's AA sequence
   **/
  public LocatedPeptide sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the peptide's AA sequence")
  @JsonProperty("sequence")
  public String getSequence() {
    return sequence;
  }
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  /**
   * a list of assays the peptide has been reported in
   **/
  public LocatedPeptide assays(List<String> assays) {
    this.assays = assays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of assays the peptide has been reported in")
  @JsonProperty("assays")
  public List<String> getAssays() {
    return assays;
  }
  public void setAssays(List<String> assays) {
    this.assays = assays;
  }


  /**
   * a list of cluster the peptide has been reported in
   **/
  public LocatedPeptide clusters(List<String> clusters) {
    this.clusters = clusters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of cluster the peptide has been reported in")
  @JsonProperty("clusters")
  public List<String> getClusters() {
    return clusters;
  }
  public void setClusters(List<String> clusters) {
    this.clusters = clusters;
  }


  /**
   * a list of reported tissues
   **/
  public LocatedPeptide tissues(List<String> tissues) {
    this.tissues = tissues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "a list of reported tissues")
  @JsonProperty("tissues")
  public List<String> getTissues() {
    return tissues;
  }
  public void setTissues(List<String> tissues) {
    this.tissues = tissues;
  }


  /**
   * the peptide's species (taxon id)
   **/
  public LocatedPeptide taxonID(Integer taxonID) {
    this.taxonID = taxonID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the peptide's species (taxon id)")
  @JsonProperty("taxonID")
  public Integer getTaxonID() {
    return taxonID;
  }
  public void setTaxonID(Integer taxonID) {
    this.taxonID = taxonID;
  }


  /**
   * positioned modifications of the peptide (if any and if not symbolic)
   **/
  public LocatedPeptide modifiedLocations(List<ModifiedLocation> modifiedLocations) {
    this.modifiedLocations = modifiedLocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "positioned modifications of the peptide (if any and if not symbolic)")
  @JsonProperty("modifiedLocations")
  public List<ModifiedLocation> getModifiedLocations() {
    return modifiedLocations;
  }
  public void setModifiedLocations(List<ModifiedLocation> modifiedLocations) {
    this.modifiedLocations = modifiedLocations;
  }


  /**
   * flag whether this peptide is 'symbolic' (represents a AA sequence only, no modifications)
   **/
  public LocatedPeptide symbolic(Boolean symbolic) {
    this.symbolic = symbolic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "flag whether this peptide is 'symbolic' (represents a AA sequence only, no modifications)")
  @JsonProperty("symbolic")
  public Boolean getSymbolic() {
    return symbolic;
  }
  public void setSymbolic(Boolean symbolic) {
    this.symbolic = symbolic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocatedPeptide locatedPeptide = (LocatedPeptide) o;
    return Objects.equals(this.position, locatedPeptide.position) &&
        Objects.equals(this.uniqueness, locatedPeptide.uniqueness) &&
        Objects.equals(this.sharedProteins, locatedPeptide.sharedProteins) &&
        Objects.equals(this.sharedGenes, locatedPeptide.sharedGenes) &&
        Objects.equals(this.id, locatedPeptide.id) &&
        Objects.equals(this.sequence, locatedPeptide.sequence) &&
        Objects.equals(this.assays, locatedPeptide.assays) &&
        Objects.equals(this.clusters, locatedPeptide.clusters) &&
        Objects.equals(this.tissues, locatedPeptide.tissues) &&
        Objects.equals(this.taxonID, locatedPeptide.taxonID) &&
        Objects.equals(this.modifiedLocations, locatedPeptide.modifiedLocations) &&
        Objects.equals(this.symbolic, locatedPeptide.symbolic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, uniqueness, sharedProteins, sharedGenes, id, sequence, assays, clusters, tissues, taxonID, modifiedLocations, symbolic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocatedPeptide {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    uniqueness: ").append(toIndentedString(uniqueness)).append("\n");
    sb.append("    sharedProteins: ").append(toIndentedString(sharedProteins)).append("\n");
    sb.append("    sharedGenes: ").append(toIndentedString(sharedGenes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    assays: ").append(toIndentedString(assays)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    tissues: ").append(toIndentedString(tissues)).append("\n");
    sb.append("    taxonID: ").append(toIndentedString(taxonID)).append("\n");
    sb.append("    modifiedLocations: ").append(toIndentedString(modifiedLocations)).append("\n");
    sb.append("    symbolic: ").append(toIndentedString(symbolic)).append("\n");
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

