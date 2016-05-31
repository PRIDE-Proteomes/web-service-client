
# LocatedPeptide

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**position** | **Integer** | the position of the peptide on the mapped protein |  [optional]
**uniqueness** | **Integer** | represent the most restricted uniqueness level |  [optional]
**sharedProteins** | **List&lt;String&gt;** | protein accessions shared with this peptide |  [optional]
**sharedGenes** | **List&lt;String&gt;** | gene accessions shared with this peptide |  [optional]
**id** | **String** |  |  [optional]
**sequence** | **String** | the peptide&#39;s AA sequence |  [optional]
**assays** | **List&lt;String&gt;** | a list of assays the peptide has been reported in |  [optional]
**clusters** | **List&lt;String&gt;** | a list of cluster the peptide has been reported in |  [optional]
**tissues** | **List&lt;String&gt;** | a list of reported tissues |  [optional]
**taxonID** | **Integer** | the peptide&#39;s species (taxon id) |  [optional]
**modifiedLocations** | [**List&lt;ModifiedLocation&gt;**](ModifiedLocation.md) | positioned modifications of the peptide (if any and if not symbolic) |  [optional]
**symbolic** | **Boolean** | flag whether this peptide is &#39;symbolic&#39; (represents a AA sequence only, no modifications) |  [optional]



