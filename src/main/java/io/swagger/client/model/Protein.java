package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Feature;
import io.swagger.client.model.LocatedPeptide;
import io.swagger.client.model.ModifiedLocation;
import java.util.ArrayList;
import java.util.List;


/**
 * Information about a protein
 */
@ApiModel(description = "Information about a protein")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class Protein   {
  
  private String name = null;
  private String description = null;
  private String sequence = null;
  private List<String> tissues = new ArrayList<String>();
  private String alternativeName = null;
  private String geneSymbol = null;
  private List<Feature> features = new ArrayList<Feature>();
  private List<LocatedPeptide> peptides = new ArrayList<LocatedPeptide>();
  private List<String> genes = new ArrayList<String>();
  private Integer uniquePeptideToGeneCount = null;
  private Integer nonUniquePeptidesCount = null;
  private String proteinEvidence = null;
  private String accession = null;
  private Integer uniquePeptideToProteinCount = null;
  private String species = null;
  private Integer taxonID = null;
  private List<ModifiedLocation> modifiedLocations = new ArrayList<ModifiedLocation>();

  
  /**
   **/
  public Protein name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * the protein's description
   **/
  public Protein description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * the protein's sequence
   **/
  public Protein sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's sequence")
  @JsonProperty("sequence")
  public String getSequence() {
    return sequence;
  }
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  /**
   * the protein's reported tissue annotations
   **/
  public Protein tissues(List<String> tissues) {
    this.tissues = tissues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's reported tissue annotations")
  @JsonProperty("tissues")
  public List<String> getTissues() {
    return tissues;
  }
  public void setTissues(List<String> tissues) {
    this.tissues = tissues;
  }


  /**
   **/
  public Protein alternativeName(String alternativeName) {
    this.alternativeName = alternativeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alternativeName")
  public String getAlternativeName() {
    return alternativeName;
  }
  public void setAlternativeName(String alternativeName) {
    this.alternativeName = alternativeName;
  }


  /**
   **/
  public Protein geneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("geneSymbol")
  public String getGeneSymbol() {
    return geneSymbol;
  }
  public void setGeneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
  }


  /**
   * the protein's reported features
   **/
  public Protein features(List<Feature> features) {
    this.features = features;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's reported features")
  @JsonProperty("features")
  public List<Feature> getFeatures() {
    return features;
  }
  public void setFeatures(List<Feature> features) {
    this.features = features;
  }


  /**
   * the protein's reported peptides
   **/
  public Protein peptides(List<LocatedPeptide> peptides) {
    this.peptides = peptides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's reported peptides")
  @JsonProperty("peptides")
  public List<LocatedPeptide> getPeptides() {
    return peptides;
  }
  public void setPeptides(List<LocatedPeptide> peptides) {
    this.peptides = peptides;
  }


  /**
   * the protein's associated genes
   **/
  public Protein genes(List<String> genes) {
    this.genes = genes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's associated genes")
  @JsonProperty("genes")
  public List<String> getGenes() {
    return genes;
  }
  public void setGenes(List<String> genes) {
    this.genes = genes;
  }


  /**
   * number of peptides unique to proteins encoded by the same gene
   **/
  public Protein uniquePeptideToGeneCount(Integer uniquePeptideToGeneCount) {
    this.uniquePeptideToGeneCount = uniquePeptideToGeneCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of peptides unique to proteins encoded by the same gene")
  @JsonProperty("uniquePeptideToGeneCount")
  public Integer getUniquePeptideToGeneCount() {
    return uniquePeptideToGeneCount;
  }
  public void setUniquePeptideToGeneCount(Integer uniquePeptideToGeneCount) {
    this.uniquePeptideToGeneCount = uniquePeptideToGeneCount;
  }


  /**
   * number of shared peptides
   **/
  public Protein nonUniquePeptidesCount(Integer nonUniquePeptidesCount) {
    this.nonUniquePeptidesCount = nonUniquePeptidesCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of shared peptides")
  @JsonProperty("nonUniquePeptidesCount")
  public Integer getNonUniquePeptidesCount() {
    return nonUniquePeptidesCount;
  }
  public void setNonUniquePeptidesCount(Integer nonUniquePeptidesCount) {
    this.nonUniquePeptidesCount = nonUniquePeptidesCount;
  }


  /**
   **/
  public Protein proteinEvidence(String proteinEvidence) {
    this.proteinEvidence = proteinEvidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proteinEvidence")
  public String getProteinEvidence() {
    return proteinEvidence;
  }
  public void setProteinEvidence(String proteinEvidence) {
    this.proteinEvidence = proteinEvidence;
  }


  /**
   * the protein's accession
   **/
  public Protein accession(String accession) {
    this.accession = accession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's accession")
  @JsonProperty("accession")
  public String getAccession() {
    return accession;
  }
  public void setAccession(String accession) {
    this.accession = accession;
  }


  /**
   * number of peptides unique to this protein
   **/
  public Protein uniquePeptideToProteinCount(Integer uniquePeptideToProteinCount) {
    this.uniquePeptideToProteinCount = uniquePeptideToProteinCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of peptides unique to this protein")
  @JsonProperty("uniquePeptideToProteinCount")
  public Integer getUniquePeptideToProteinCount() {
    return uniquePeptideToProteinCount;
  }
  public void setUniquePeptideToProteinCount(Integer uniquePeptideToProteinCount) {
    this.uniquePeptideToProteinCount = uniquePeptideToProteinCount;
  }


  /**
   **/
  public Protein species(String species) {
    this.species = species;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("species")
  public String getSpecies() {
    return species;
  }
  public void setSpecies(String species) {
    this.species = species;
  }


  /**
   * the protein's species (taxon id)
   **/
  public Protein taxonID(Integer taxonID) {
    this.taxonID = taxonID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's species (taxon id)")
  @JsonProperty("taxonID")
  public Integer getTaxonID() {
    return taxonID;
  }
  public void setTaxonID(Integer taxonID) {
    this.taxonID = taxonID;
  }


  /**
   * the protein's reported modifications
   **/
  public Protein modifiedLocations(List<ModifiedLocation> modifiedLocations) {
    this.modifiedLocations = modifiedLocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the protein's reported modifications")
  @JsonProperty("modifiedLocations")
  public List<ModifiedLocation> getModifiedLocations() {
    return modifiedLocations;
  }
  public void setModifiedLocations(List<ModifiedLocation> modifiedLocations) {
    this.modifiedLocations = modifiedLocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Protein protein = (Protein) o;
    return Objects.equals(this.name, protein.name) &&
        Objects.equals(this.description, protein.description) &&
        Objects.equals(this.sequence, protein.sequence) &&
        Objects.equals(this.tissues, protein.tissues) &&
        Objects.equals(this.alternativeName, protein.alternativeName) &&
        Objects.equals(this.geneSymbol, protein.geneSymbol) &&
        Objects.equals(this.features, protein.features) &&
        Objects.equals(this.peptides, protein.peptides) &&
        Objects.equals(this.genes, protein.genes) &&
        Objects.equals(this.uniquePeptideToGeneCount, protein.uniquePeptideToGeneCount) &&
        Objects.equals(this.nonUniquePeptidesCount, protein.nonUniquePeptidesCount) &&
        Objects.equals(this.proteinEvidence, protein.proteinEvidence) &&
        Objects.equals(this.accession, protein.accession) &&
        Objects.equals(this.uniquePeptideToProteinCount, protein.uniquePeptideToProteinCount) &&
        Objects.equals(this.species, protein.species) &&
        Objects.equals(this.taxonID, protein.taxonID) &&
        Objects.equals(this.modifiedLocations, protein.modifiedLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, sequence, tissues, alternativeName, geneSymbol, features, peptides, genes, uniquePeptideToGeneCount, nonUniquePeptidesCount, proteinEvidence, accession, uniquePeptideToProteinCount, species, taxonID, modifiedLocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Protein {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    tissues: ").append(toIndentedString(tissues)).append("\n");
    sb.append("    alternativeName: ").append(toIndentedString(alternativeName)).append("\n");
    sb.append("    geneSymbol: ").append(toIndentedString(geneSymbol)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    peptides: ").append(toIndentedString(peptides)).append("\n");
    sb.append("    genes: ").append(toIndentedString(genes)).append("\n");
    sb.append("    uniquePeptideToGeneCount: ").append(toIndentedString(uniquePeptideToGeneCount)).append("\n");
    sb.append("    nonUniquePeptidesCount: ").append(toIndentedString(nonUniquePeptidesCount)).append("\n");
    sb.append("    proteinEvidence: ").append(toIndentedString(proteinEvidence)).append("\n");
    sb.append("    accession: ").append(toIndentedString(accession)).append("\n");
    sb.append("    uniquePeptideToProteinCount: ").append(toIndentedString(uniquePeptideToProteinCount)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    taxonID: ").append(toIndentedString(taxonID)).append("\n");
    sb.append("    modifiedLocations: ").append(toIndentedString(modifiedLocations)).append("\n");
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

