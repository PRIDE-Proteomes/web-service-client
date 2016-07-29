# proteomes-web-service-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>uk.ac.ebi.pride.proteomes.web</groupId>
    <artifactId>proteomes-web-service-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "uk.ac.ebi.pride.proteomes.web:proteomes-web-service-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/proteomes-web-service-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import uk.ac.ebi.pride.proteomes.web.*;
import uk.ac.ebi.pride.proteomes.web.auth.*;
import uk.ac.ebi.pride.proteomes.web.model.*;
import uk.ac.ebi.pride.proteomes.web.PeptidecontrollerApi;

import java.io.File;
import java.util.*;

public class PeptidecontrollerApiExample {

    public static void main(String[] args) {
        
        PeptidecontrollerApi apiInstance = new PeptidecontrollerApi();
        String sequence = "sequence_example"; // String | sequence
        Integer species = 9606; // Integer | species
        String tissue = "any"; // String | tissue
        String mod = "any"; // String | mod
        Boolean includeDetails = true; // Boolean | includeDetails
        try {
            PeptideList result = apiInstance.getByIdUsingGET1(sequence, species, tissue, mod, includeDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PeptidecontrollerApi#getByIdUsingGET1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://wwwdev.ebi.ac.uk/pride/ws/proteomes*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PeptidecontrollerApi* | [**getByIdUsingGET1**](docs/PeptidecontrollerApi.md#getByIdUsingGET1) | **GET** /peptide/{sequence} | getById
*PeptidecontrollerApi* | [**getPeptideListForProteinUsingGET1**](docs/PeptidecontrollerApi.md#getPeptideListForProteinUsingGET1) | **GET** /peptide/list/protein/{acc} | getPeptideListForProtein
*PeptidecontrollerApi* | [**getPeptideListUsingGET1**](docs/PeptidecontrollerApi.md#getPeptideListUsingGET1) | **GET** /peptide/list | getPeptideList
*ProteincontrollerApi* | [**getByIdUsingGET2**](docs/ProteincontrollerApi.md#getByIdUsingGET2) | **GET** /protein/{id} | getById
*ProteincontrollerApi* | [**getProteinCountUsingGET**](docs/ProteincontrollerApi.md#getProteinCountUsingGET) | **GET** /protein/count | getProteinCount
*ProteincontrollerApi* | [**getProteinListForPeptideUsingGET1**](docs/ProteincontrollerApi.md#getProteinListForPeptideUsingGET1) | **GET** /protein/list/peptide/{sequence} | getProteinListForPeptide
*ProteincontrollerApi* | [**getProteinListUsingGET1**](docs/ProteincontrollerApi.md#getProteinListUsingGET1) | **GET** /protein/list | getProteinList
*ProteingroupcontrollerApi* | [**getByIdUsingGET5**](docs/ProteingroupcontrollerApi.md#getByIdUsingGET5) | **GET** /group/{id} | getById
*ProteingroupcontrollerApi* | [**getProteinGroupListForProteinUsingGET**](docs/ProteingroupcontrollerApi.md#getProteinGroupListForProteinUsingGET) | **GET** /group/list/protein/{acc} | getProteinGroupListForProtein
*ProteingroupcontrollerApi* | [**getProteinGroupListUsingGET**](docs/ProteingroupcontrollerApi.md#getProteinGroupListUsingGET) | **GET** /group/list | getProteinGroupList
*ReleasecontrollerApi* | [**getReleaseSummaryForSpeciesUsingGET**](docs/ReleasecontrollerApi.md#getReleaseSummaryForSpeciesUsingGET) | **GET** /release/summary/species/{species} | getReleaseSummaryForSpecies
*ReleasecontrollerApi* | [**getReleaseSummaryUsingGET1**](docs/ReleasecontrollerApi.md#getReleaseSummaryUsingGET1) | **GET** /release/summary/list | getReleaseSummary
*SamplecontrollerApi* | [**countTissuesUsingGET**](docs/SamplecontrollerApi.md#countTissuesUsingGET) | **GET** /sample/tissues/count/species/{species} | countTissues
*SamplecontrollerApi* | [**getSpeciesUsingGET1**](docs/SamplecontrollerApi.md#getSpeciesUsingGET1) | **GET** /sample/species | getSpecies
*SamplecontrollerApi* | [**getTissuesUsingGET1**](docs/SamplecontrollerApi.md#getTissuesUsingGET1) | **GET** /sample/tissues/list/species/{species} | getTissues
*SamplecontrollerApi* | [**getTissuesUsingGET3**](docs/SamplecontrollerApi.md#getTissuesUsingGET3) | **GET** /sample/tissues/list | getTissues
*StatisticscontrollerApi* | [**getSummaryUsingGET**](docs/StatisticscontrollerApi.md#getSummaryUsingGET) | **GET** /stats/summary | getSummary


## Documentation for Models

 - [DatasetStats](docs/DatasetStats.md)
 - [Feature](docs/Feature.md)
 - [ModifiedLocation](docs/ModifiedLocation.md)
 - [Peptide](docs/Peptide.md)
 - [PeptideList](docs/PeptideList.md)
 - [Protein](docs/Protein.md)
 - [ProteinGroup](docs/ProteinGroup.md)
 - [ProteinGroupList](docs/ProteinGroupList.md)
 - [ProteinList](docs/ProteinList.md)
 - [ReleaseSummary](docs/ReleaseSummary.md)
 - [ReleaseSummaryList](docs/ReleaseSummaryList.md)
 - [SpeciesList](docs/SpeciesList.md)
 - [Statistics](docs/Statistics.md)
 - [TissueList](docs/TissueList.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

pride-support@ebi.ac.uk

