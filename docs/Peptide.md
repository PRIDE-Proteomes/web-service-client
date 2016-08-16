
# Peptide

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assays** | **List&lt;String&gt;** | a list of assays the peptide has been reported in |  [optional]
**clusters** | **List&lt;String&gt;** | a list of cluster the peptide has been reported in |  [optional]
**id** | **String** |  |  [optional]
**modifiedLocations** | [**List&lt;ModifiedLocation&gt;**](ModifiedLocation.md) | positioned modifications of the peptide (if any and if not symbolic) |  [optional]
**position** | **Integer** | the position of the peptide on the mapped protein |  [optional]
**sequence** | **String** | the peptide&#39;s AA sequence |  [optional]
**sharedGenes** | **List&lt;String&gt;** | gene accessions shared with this peptide |  [optional]
**sharedProteins** | **List&lt;String&gt;** | protein accessions shared with this peptide |  [optional]
**symbolic** | **Boolean** | flag whether this peptide is &#39;symbolic&#39; (represents a AA sequence only, no modifications) |  [optional]
**taxonID** | **Integer** | the peptide&#39;s species (taxon id) |  [optional]
**tissues** | [**List&lt;TissuesEnum&gt;**](#List&lt;TissuesEnum&gt;) | a list of reported tissues |  [optional]
**uniqueness** | **Integer** | represent the most restricted uniqueness level |  [optional]


<a name="List<TissuesEnum>"></a>
## Enum: List&lt;TissuesEnum&gt;
Name | Value
---- | -----



