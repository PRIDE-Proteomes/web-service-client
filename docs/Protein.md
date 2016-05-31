
# Protein

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**description** | **String** | the protein&#39;s description |  [optional]
**sequence** | **String** | the protein&#39;s sequence |  [optional]
**tissues** | **List&lt;String&gt;** | the protein&#39;s reported tissue annotations |  [optional]
**alternativeName** | **String** |  |  [optional]
**geneSymbol** | **String** |  |  [optional]
**features** | [**List&lt;Feature&gt;**](Feature.md) | the protein&#39;s reported features |  [optional]
**peptides** | [**List&lt;LocatedPeptide&gt;**](LocatedPeptide.md) | the protein&#39;s reported peptides |  [optional]
**genes** | **List&lt;String&gt;** | the protein&#39;s associated genes |  [optional]
**uniquePeptideToGeneCount** | **Integer** | number of peptides unique to proteins encoded by the same gene |  [optional]
**nonUniquePeptidesCount** | **Integer** | number of shared peptides |  [optional]
**proteinEvidence** | **String** |  |  [optional]
**accession** | **String** | the protein&#39;s accession |  [optional]
**uniquePeptideToProteinCount** | **Integer** | number of peptides unique to this protein |  [optional]
**species** | **String** |  |  [optional]
**taxonID** | **Integer** | the protein&#39;s species (taxon id) |  [optional]
**modifiedLocations** | [**List&lt;ModifiedLocation&gt;**](ModifiedLocation.md) | the protein&#39;s reported modifications |  [optional]



