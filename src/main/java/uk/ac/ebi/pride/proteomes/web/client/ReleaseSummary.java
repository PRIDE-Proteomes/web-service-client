package uk.ac.ebi.pride.proteomes.web.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * ReleaseSummary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class ReleaseSummary   {

  private Long numCanonicalProteins = null;
  private Long numGenes = null;
  private Long numIsoformProteins = null;
  private Long numMappedCanonicalProteins = null;
  private Long numMappedCanonicalProteinsWithUniquePeptides = null;
  private Long numMappedGenes = null;
  private Long numMappedGenesWithUniquePeptides = null;
  private Long numMappedIsoformProteins = null;
  private Long numMappedIsoformProteinsWithUniquePeptides = null;
  private Long numMappedPeptidesToProteins = null;
  private Long numMappedProteinWithEvidencePredicted = null;
  private Long numMappedProteinWithEvidenceUncertain = null;
  private Long numMappedProteins = null;
  private Long numMappedProteinsWithEvidenceInferredByHomology = null;
  private Long numMappedProteinsWithExpEvidenceAtTranscript = null;
  private Long numMappedProteinsWithUniquePeptides = null;
  private Long numMappedUniquePeptidesToCanonicalProteins = null;
  private Long numMappedUniquePeptidesToGenes = null;
  private Long numMappedUniquePeptidesToIsoformProteins = null;
  private Long numMappedUniquePeptidesToProteins = null;
  private Long numPeptides = null;
  private Long numPeptiforms = null;
  private Long numProteins = null;
  private String referenceDatabase = null;
  private String referenceDatabaseVersion = null;
  private Integer taxonID = null;
  private String scientificName = null;


  /**
   **/
  public ReleaseSummary numCanonicalProteins(Long numCanonicalProteins) {
    this.numCanonicalProteins = numCanonicalProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numCanonicalProteins")
  public Long getNumCanonicalProteins() {
    return numCanonicalProteins;
  }
  public void setNumCanonicalProteins(Long numCanonicalProteins) {
    this.numCanonicalProteins = numCanonicalProteins;
  }


  /**
   **/
  public ReleaseSummary numGenes(Long numGenes) {
    this.numGenes = numGenes;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numGenes")
  public Long getNumGenes() {
    return numGenes;
  }
  public void setNumGenes(Long numGenes) {
    this.numGenes = numGenes;
  }


  /**
   **/
  public ReleaseSummary numIsoformProteins(Long numIsoformProteins) {
    this.numIsoformProteins = numIsoformProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numIsoformProteins")
  public Long getNumIsoformProteins() {
    return numIsoformProteins;
  }
  public void setNumIsoformProteins(Long numIsoformProteins) {
    this.numIsoformProteins = numIsoformProteins;
  }


  /**
   **/
  public ReleaseSummary numMappedCanonicalProteins(Long numMappedCanonicalProteins) {
    this.numMappedCanonicalProteins = numMappedCanonicalProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedCanonicalProteins")
  public Long getNumMappedCanonicalProteins() {
    return numMappedCanonicalProteins;
  }
  public void setNumMappedCanonicalProteins(Long numMappedCanonicalProteins) {
    this.numMappedCanonicalProteins = numMappedCanonicalProteins;
  }


  /**
   **/
  public ReleaseSummary numMappedCanonicalProteinsWithUniquePeptides(Long numMappedCanonicalProteinsWithUniquePeptides) {
    this.numMappedCanonicalProteinsWithUniquePeptides = numMappedCanonicalProteinsWithUniquePeptides;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedCanonicalProteinsWithUniquePeptides")
  public Long getNumMappedCanonicalProteinsWithUniquePeptides() {
    return numMappedCanonicalProteinsWithUniquePeptides;
  }
  public void setNumMappedCanonicalProteinsWithUniquePeptides(Long numMappedCanonicalProteinsWithUniquePeptides) {
    this.numMappedCanonicalProteinsWithUniquePeptides = numMappedCanonicalProteinsWithUniquePeptides;
  }


  /**
   **/
  public ReleaseSummary numMappedGenes(Long numMappedGenes) {
    this.numMappedGenes = numMappedGenes;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedGenes")
  public Long getNumMappedGenes() {
    return numMappedGenes;
  }
  public void setNumMappedGenes(Long numMappedGenes) {
    this.numMappedGenes = numMappedGenes;
  }


  /**
   **/
  public ReleaseSummary numMappedGenesWithUniquePeptides(Long numMappedGenesWithUniquePeptides) {
    this.numMappedGenesWithUniquePeptides = numMappedGenesWithUniquePeptides;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedGenesWithUniquePeptides")
  public Long getNumMappedGenesWithUniquePeptides() {
    return numMappedGenesWithUniquePeptides;
  }
  public void setNumMappedGenesWithUniquePeptides(Long numMappedGenesWithUniquePeptides) {
    this.numMappedGenesWithUniquePeptides = numMappedGenesWithUniquePeptides;
  }


  /**
   **/
  public ReleaseSummary numMappedIsoformProteins(Long numMappedIsoformProteins) {
    this.numMappedIsoformProteins = numMappedIsoformProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedIsoformProteins")
  public Long getNumMappedIsoformProteins() {
    return numMappedIsoformProteins;
  }
  public void setNumMappedIsoformProteins(Long numMappedIsoformProteins) {
    this.numMappedIsoformProteins = numMappedIsoformProteins;
  }


  /**
   **/
  public ReleaseSummary numMappedIsoformProteinsWithUniquePeptides(Long numMappedIsoformProteinsWithUniquePeptides) {
    this.numMappedIsoformProteinsWithUniquePeptides = numMappedIsoformProteinsWithUniquePeptides;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedIsoformProteinsWithUniquePeptides")
  public Long getNumMappedIsoformProteinsWithUniquePeptides() {
    return numMappedIsoformProteinsWithUniquePeptides;
  }
  public void setNumMappedIsoformProteinsWithUniquePeptides(Long numMappedIsoformProteinsWithUniquePeptides) {
    this.numMappedIsoformProteinsWithUniquePeptides = numMappedIsoformProteinsWithUniquePeptides;
  }


  /**
   **/
  public ReleaseSummary numMappedPeptidesToProteins(Long numMappedPeptidesToProteins) {
    this.numMappedPeptidesToProteins = numMappedPeptidesToProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedPeptidesToProteins")
  public Long getNumMappedPeptidesToProteins() {
    return numMappedPeptidesToProteins;
  }
  public void setNumMappedPeptidesToProteins(Long numMappedPeptidesToProteins) {
    this.numMappedPeptidesToProteins = numMappedPeptidesToProteins;
  }


  /**
   **/
  public ReleaseSummary numMappedProteinWithEvidencePredicted(Long numMappedProteinWithEvidencePredicted) {
    this.numMappedProteinWithEvidencePredicted = numMappedProteinWithEvidencePredicted;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedProteinWithEvidencePredicted")
  public Long getNumMappedProteinWithEvidencePredicted() {
    return numMappedProteinWithEvidencePredicted;
  }
  public void setNumMappedProteinWithEvidencePredicted(Long numMappedProteinWithEvidencePredicted) {
    this.numMappedProteinWithEvidencePredicted = numMappedProteinWithEvidencePredicted;
  }


  /**
   **/
  public ReleaseSummary numMappedProteinWithEvidenceUncertain(Long numMappedProteinWithEvidenceUncertain) {
    this.numMappedProteinWithEvidenceUncertain = numMappedProteinWithEvidenceUncertain;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedProteinWithEvidenceUncertain")
  public Long getNumMappedProteinWithEvidenceUncertain() {
    return numMappedProteinWithEvidenceUncertain;
  }
  public void setNumMappedProteinWithEvidenceUncertain(Long numMappedProteinWithEvidenceUncertain) {
    this.numMappedProteinWithEvidenceUncertain = numMappedProteinWithEvidenceUncertain;
  }


  /**
   **/
  public ReleaseSummary numMappedProteins(Long numMappedProteins) {
    this.numMappedProteins = numMappedProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedProteins")
  public Long getNumMappedProteins() {
    return numMappedProteins;
  }
  public void setNumMappedProteins(Long numMappedProteins) {
    this.numMappedProteins = numMappedProteins;
  }


  /**
   **/
  public ReleaseSummary numMappedProteinsWithEvidenceInferredByHomology(Long numMappedProteinsWithEvidenceInferredByHomology) {
    this.numMappedProteinsWithEvidenceInferredByHomology = numMappedProteinsWithEvidenceInferredByHomology;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedProteinsWithEvidenceInferredByHomology")
  public Long getNumMappedProteinsWithEvidenceInferredByHomology() {
    return numMappedProteinsWithEvidenceInferredByHomology;
  }
  public void setNumMappedProteinsWithEvidenceInferredByHomology(Long numMappedProteinsWithEvidenceInferredByHomology) {
    this.numMappedProteinsWithEvidenceInferredByHomology = numMappedProteinsWithEvidenceInferredByHomology;
  }


  /**
   **/
  public ReleaseSummary numMappedProteinsWithExpEvidenceAtTranscript(Long numMappedProteinsWithExpEvidenceAtTranscript) {
    this.numMappedProteinsWithExpEvidenceAtTranscript = numMappedProteinsWithExpEvidenceAtTranscript;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedProteinsWithExpEvidenceAtTranscript")
  public Long getNumMappedProteinsWithExpEvidenceAtTranscript() {
    return numMappedProteinsWithExpEvidenceAtTranscript;
  }
  public void setNumMappedProteinsWithExpEvidenceAtTranscript(Long numMappedProteinsWithExpEvidenceAtTranscript) {
    this.numMappedProteinsWithExpEvidenceAtTranscript = numMappedProteinsWithExpEvidenceAtTranscript;
  }


  /**
   **/
  public ReleaseSummary numMappedProteinsWithUniquePeptides(Long numMappedProteinsWithUniquePeptides) {
    this.numMappedProteinsWithUniquePeptides = numMappedProteinsWithUniquePeptides;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedProteinsWithUniquePeptides")
  public Long getNumMappedProteinsWithUniquePeptides() {
    return numMappedProteinsWithUniquePeptides;
  }
  public void setNumMappedProteinsWithUniquePeptides(Long numMappedProteinsWithUniquePeptides) {
    this.numMappedProteinsWithUniquePeptides = numMappedProteinsWithUniquePeptides;
  }


  /**
   **/
  public ReleaseSummary numMappedUniquePeptidesToCanonicalProteins(Long numMappedUniquePeptidesToCanonicalProteins) {
    this.numMappedUniquePeptidesToCanonicalProteins = numMappedUniquePeptidesToCanonicalProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedUniquePeptidesToCanonicalProteins")
  public Long getNumMappedUniquePeptidesToCanonicalProteins() {
    return numMappedUniquePeptidesToCanonicalProteins;
  }
  public void setNumMappedUniquePeptidesToCanonicalProteins(Long numMappedUniquePeptidesToCanonicalProteins) {
    this.numMappedUniquePeptidesToCanonicalProteins = numMappedUniquePeptidesToCanonicalProteins;
  }


  /**
   **/
  public ReleaseSummary numMappedUniquePeptidesToGenes(Long numMappedUniquePeptidesToGenes) {
    this.numMappedUniquePeptidesToGenes = numMappedUniquePeptidesToGenes;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedUniquePeptidesToGenes")
  public Long getNumMappedUniquePeptidesToGenes() {
    return numMappedUniquePeptidesToGenes;
  }
  public void setNumMappedUniquePeptidesToGenes(Long numMappedUniquePeptidesToGenes) {
    this.numMappedUniquePeptidesToGenes = numMappedUniquePeptidesToGenes;
  }


  /**
   **/
  public ReleaseSummary numMappedUniquePeptidesToIsoformProteins(Long numMappedUniquePeptidesToIsoformProteins) {
    this.numMappedUniquePeptidesToIsoformProteins = numMappedUniquePeptidesToIsoformProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedUniquePeptidesToIsoformProteins")
  public Long getNumMappedUniquePeptidesToIsoformProteins() {
    return numMappedUniquePeptidesToIsoformProteins;
  }
  public void setNumMappedUniquePeptidesToIsoformProteins(Long numMappedUniquePeptidesToIsoformProteins) {
    this.numMappedUniquePeptidesToIsoformProteins = numMappedUniquePeptidesToIsoformProteins;
  }


  /**
   **/
  public ReleaseSummary numMappedUniquePeptidesToProteins(Long numMappedUniquePeptidesToProteins) {
    this.numMappedUniquePeptidesToProteins = numMappedUniquePeptidesToProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numMappedUniquePeptidesToProteins")
  public Long getNumMappedUniquePeptidesToProteins() {
    return numMappedUniquePeptidesToProteins;
  }
  public void setNumMappedUniquePeptidesToProteins(Long numMappedUniquePeptidesToProteins) {
    this.numMappedUniquePeptidesToProteins = numMappedUniquePeptidesToProteins;
  }


  /**
   **/
  public ReleaseSummary numPeptides(Long numPeptides) {
    this.numPeptides = numPeptides;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numPeptides")
  public Long getNumPeptides() {
    return numPeptides;
  }
  public void setNumPeptides(Long numPeptides) {
    this.numPeptides = numPeptides;
  }


  /**
   **/
  public ReleaseSummary numPeptiforms(Long numPeptiforms) {
    this.numPeptiforms = numPeptiforms;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numPeptiforms")
  public Long getNumPeptiforms() {
    return numPeptiforms;
  }
  public void setNumPeptiforms(Long numPeptiforms) {
    this.numPeptiforms = numPeptiforms;
  }


  /**
   **/
  public ReleaseSummary numProteins(Long numProteins) {
    this.numProteins = numProteins;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numProteins")
  public Long getNumProteins() {
    return numProteins;
  }
  public void setNumProteins(Long numProteins) {
    this.numProteins = numProteins;
  }


  /**
   **/
  public ReleaseSummary referenceDatabase(String referenceDatabase) {
    this.referenceDatabase = referenceDatabase;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceDatabase")
  public String getReferenceDatabase() {
    return referenceDatabase;
  }
  public void setReferenceDatabase(String referenceDatabase) {
    this.referenceDatabase = referenceDatabase;
  }


  /**
   **/
  public ReleaseSummary referenceDatabaseVersion(String referenceDatabaseVersion) {
    this.referenceDatabaseVersion = referenceDatabaseVersion;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceDatabaseVersion")
  public String getReferenceDatabaseVersion() {
    return referenceDatabaseVersion;
  }
  public void setReferenceDatabaseVersion(String referenceDatabaseVersion) {
    this.referenceDatabaseVersion = referenceDatabaseVersion;
  }


  /**
   * the release summary's species (taxon id)
   **/
  public ReleaseSummary taxonID(Integer taxonID) {
    this.taxonID = taxonID;
    return this;
  }

  @ApiModelProperty(example = "null", value = "the release summary's species (taxon id)")
  @JsonProperty("taxonID")
  public Integer getTaxonID() {
    return taxonID;
  }
  public void setTaxonID(Integer taxonID) {
    this.taxonID = taxonID;
  }

  /**
   * the release summary's species (taxon id)
   **/
  public ReleaseSummary scientificName(String scientificName) {
    this.scientificName = scientificName;
    return this;
  }

  @ApiModelProperty(example = "null", value = "the release summary's species (scientific name)")
  @JsonProperty("scientific name")
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
    ReleaseSummary releaseSummary = (ReleaseSummary) o;
    return Objects.equals(this.numCanonicalProteins, releaseSummary.numCanonicalProteins) &&
        Objects.equals(this.numGenes, releaseSummary.numGenes) &&
        Objects.equals(this.numIsoformProteins, releaseSummary.numIsoformProteins) &&
        Objects.equals(this.numMappedCanonicalProteins, releaseSummary.numMappedCanonicalProteins) &&
        Objects.equals(this.numMappedCanonicalProteinsWithUniquePeptides, releaseSummary.numMappedCanonicalProteinsWithUniquePeptides) &&
        Objects.equals(this.numMappedGenes, releaseSummary.numMappedGenes) &&
        Objects.equals(this.numMappedGenesWithUniquePeptides, releaseSummary.numMappedGenesWithUniquePeptides) &&
        Objects.equals(this.numMappedIsoformProteins, releaseSummary.numMappedIsoformProteins) &&
        Objects.equals(this.numMappedIsoformProteinsWithUniquePeptides, releaseSummary.numMappedIsoformProteinsWithUniquePeptides) &&
        Objects.equals(this.numMappedPeptidesToProteins, releaseSummary.numMappedPeptidesToProteins) &&
        Objects.equals(this.numMappedProteinWithEvidencePredicted, releaseSummary.numMappedProteinWithEvidencePredicted) &&
        Objects.equals(this.numMappedProteinWithEvidenceUncertain, releaseSummary.numMappedProteinWithEvidenceUncertain) &&
        Objects.equals(this.numMappedProteins, releaseSummary.numMappedProteins) &&
        Objects.equals(this.numMappedProteinsWithEvidenceInferredByHomology, releaseSummary.numMappedProteinsWithEvidenceInferredByHomology) &&
        Objects.equals(this.numMappedProteinsWithExpEvidenceAtTranscript, releaseSummary.numMappedProteinsWithExpEvidenceAtTranscript) &&
        Objects.equals(this.numMappedProteinsWithUniquePeptides, releaseSummary.numMappedProteinsWithUniquePeptides) &&
        Objects.equals(this.numMappedUniquePeptidesToCanonicalProteins, releaseSummary.numMappedUniquePeptidesToCanonicalProteins) &&
        Objects.equals(this.numMappedUniquePeptidesToGenes, releaseSummary.numMappedUniquePeptidesToGenes) &&
        Objects.equals(this.numMappedUniquePeptidesToIsoformProteins, releaseSummary.numMappedUniquePeptidesToIsoformProteins) &&
        Objects.equals(this.numMappedUniquePeptidesToProteins, releaseSummary.numMappedUniquePeptidesToProteins) &&
        Objects.equals(this.numPeptides, releaseSummary.numPeptides) &&
        Objects.equals(this.numPeptiforms, releaseSummary.numPeptiforms) &&
        Objects.equals(this.numProteins, releaseSummary.numProteins) &&
        Objects.equals(this.referenceDatabase, releaseSummary.referenceDatabase) &&
        Objects.equals(this.referenceDatabaseVersion, releaseSummary.referenceDatabaseVersion) &&
        Objects.equals(this.taxonID, releaseSummary.taxonID) &&
        Objects.equals(this.scientificName, releaseSummary.scientificName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numCanonicalProteins, numGenes, numIsoformProteins, numMappedCanonicalProteins, numMappedCanonicalProteinsWithUniquePeptides, numMappedGenes, numMappedGenesWithUniquePeptides, numMappedIsoformProteins, numMappedIsoformProteinsWithUniquePeptides, numMappedPeptidesToProteins, numMappedProteinWithEvidencePredicted, numMappedProteinWithEvidenceUncertain, numMappedProteins, numMappedProteinsWithEvidenceInferredByHomology, numMappedProteinsWithExpEvidenceAtTranscript, numMappedProteinsWithUniquePeptides, numMappedUniquePeptidesToCanonicalProteins, numMappedUniquePeptidesToGenes, numMappedUniquePeptidesToIsoformProteins, numMappedUniquePeptidesToProteins, numPeptides, numPeptiforms, numProteins, referenceDatabase, referenceDatabaseVersion, taxonID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseSummary {\n");

    sb.append("    numCanonicalProteins: ").append(toIndentedString(numCanonicalProteins)).append("\n");
    sb.append("    numGenes: ").append(toIndentedString(numGenes)).append("\n");
    sb.append("    numIsoformProteins: ").append(toIndentedString(numIsoformProteins)).append("\n");
    sb.append("    numMappedCanonicalProteins: ").append(toIndentedString(numMappedCanonicalProteins)).append("\n");
    sb.append("    numMappedCanonicalProteinsWithUniquePeptides: ").append(toIndentedString(numMappedCanonicalProteinsWithUniquePeptides)).append("\n");
    sb.append("    numMappedGenes: ").append(toIndentedString(numMappedGenes)).append("\n");
    sb.append("    numMappedGenesWithUniquePeptides: ").append(toIndentedString(numMappedGenesWithUniquePeptides)).append("\n");
    sb.append("    numMappedIsoformProteins: ").append(toIndentedString(numMappedIsoformProteins)).append("\n");
    sb.append("    numMappedIsoformProteinsWithUniquePeptides: ").append(toIndentedString(numMappedIsoformProteinsWithUniquePeptides)).append("\n");
    sb.append("    numMappedPeptidesToProteins: ").append(toIndentedString(numMappedPeptidesToProteins)).append("\n");
    sb.append("    numMappedProteinWithEvidencePredicted: ").append(toIndentedString(numMappedProteinWithEvidencePredicted)).append("\n");
    sb.append("    numMappedProteinWithEvidenceUncertain: ").append(toIndentedString(numMappedProteinWithEvidenceUncertain)).append("\n");
    sb.append("    numMappedProteins: ").append(toIndentedString(numMappedProteins)).append("\n");
    sb.append("    numMappedProteinsWithEvidenceInferredByHomology: ").append(toIndentedString(numMappedProteinsWithEvidenceInferredByHomology)).append("\n");
    sb.append("    numMappedProteinsWithExpEvidenceAtTranscript: ").append(toIndentedString(numMappedProteinsWithExpEvidenceAtTranscript)).append("\n");
    sb.append("    numMappedProteinsWithUniquePeptides: ").append(toIndentedString(numMappedProteinsWithUniquePeptides)).append("\n");
    sb.append("    numMappedUniquePeptidesToCanonicalProteins: ").append(toIndentedString(numMappedUniquePeptidesToCanonicalProteins)).append("\n");
    sb.append("    numMappedUniquePeptidesToGenes: ").append(toIndentedString(numMappedUniquePeptidesToGenes)).append("\n");
    sb.append("    numMappedUniquePeptidesToIsoformProteins: ").append(toIndentedString(numMappedUniquePeptidesToIsoformProteins)).append("\n");
    sb.append("    numMappedUniquePeptidesToProteins: ").append(toIndentedString(numMappedUniquePeptidesToProteins)).append("\n");
    sb.append("    numPeptides: ").append(toIndentedString(numPeptides)).append("\n");
    sb.append("    numPeptiforms: ").append(toIndentedString(numPeptiforms)).append("\n");
    sb.append("    numProteins: ").append(toIndentedString(numProteins)).append("\n");
    sb.append("    referenceDatabase: ").append(toIndentedString(referenceDatabase)).append("\n");
    sb.append("    referenceDatabaseVersion: ").append(toIndentedString(referenceDatabaseVersion)).append("\n");
    sb.append("    taxonID: ").append(toIndentedString(taxonID)).append("\n");
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

