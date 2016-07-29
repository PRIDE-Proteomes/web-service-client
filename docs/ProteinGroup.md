
# ProteinGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | a description for the group |  [optional]
**id** | **String** |  |  [optional]
**memberProteins** | **List&lt;String&gt;** | the proteins belonging to this group |  [optional]
**taxonID** | **Integer** | the species for this group (taxon id) |  [optional]
**tissues** | **List&lt;String&gt;** | a list of tissues (aggregated from the proteins/peptides associated to this group) |  [optional]
**uniquePeptides** | [**Map&lt;String, Set&gt;**](Set.md) | peptides unique to this group (not necessarily unique to a single protein!) |  [optional]



