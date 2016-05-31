# swagger-java-client

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
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.GroupApi;

import java.io.File;
import java.util.*;

public class GroupApiExample {

    public static void main(String[] args) {
        
        GroupApi apiInstance = new GroupApi();
        String id = "id_example"; // String | id
        Boolean uniquePeptides = true; // Boolean | uniquePeptides
        try {
            ProteinGroup result = apiInstance.getById(id, uniquePeptides);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getById");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GroupApi* | [**getById**](docs/GroupApi.md#getById) | **GET** /group/{id} | getById
*GroupApi* | [**getProteinGroupList**](docs/GroupApi.md#getProteinGroupList) | **GET** /group/list | getProteinGroupList
*GroupApi* | [**getProteinGroupListForProtein**](docs/GroupApi.md#getProteinGroupListForProtein) | **GET** /group/list/protein/{acc} | getProteinGroupListForProtein
*ModslistApi* | [**getModifications**](docs/ModslistApi.md#getModifications) | **GET** /mods/list | getModifications
*PeptideApi* | [**getById**](docs/PeptideApi.md#getById) | **GET** /peptide/{sequence} | getById
*PeptideApi* | [**getPeptideList**](docs/PeptideApi.md#getPeptideList) | **GET** /peptide/list | getPeptideList
*PeptideApi* | [**getPeptideListForProtein**](docs/PeptideApi.md#getPeptideListForProtein) | **GET** /peptide/list/protein/{acc} | getPeptideListForProtein
*ProteinApi* | [**getById**](docs/ProteinApi.md#getById) | **GET** /protein/{id} | getById
*ProteinApi* | [**getProteinCount**](docs/ProteinApi.md#getProteinCount) | **GET** /protein/count | getProteinCount
*ProteinApi* | [**getProteinList**](docs/ProteinApi.md#getProteinList) | **GET** /protein/list | getProteinList
*ProteinApi* | [**getProteinListForPeptide**](docs/ProteinApi.md#getProteinListForPeptide) | **GET** /protein/list/peptide/{sequence} | getProteinListForPeptide
*ReleasesummaryApi* | [**getReleaseSummary**](docs/ReleasesummaryApi.md#getReleaseSummary) | **GET** /release/summary/list | getReleaseSummary
*ReleasesummaryApi* | [**getReleaseSummaryForSpecies**](docs/ReleasesummaryApi.md#getReleaseSummaryForSpecies) | **GET** /release/summary/species/${species} | getReleaseSummaryForSpecies
*SampleApi* | [**countTissues**](docs/SampleApi.md#countTissues) | **GET** /sample/tissues/count/species/${species} | countTissues
*SampleApi* | [**getSpecies**](docs/SampleApi.md#getSpecies) | **GET** /sample/species | getSpecies
*SampleApi* | [**getTissues**](docs/SampleApi.md#getTissues) | **GET** /sample/tissues/list | getTissues
*SampleApi* | [**getTissues_0**](docs/SampleApi.md#getTissues_0) | **GET** /sample/tissues/list/species/${species} | getTissues
*StatssummaryApi* | [**getSummary**](docs/StatssummaryApi.md#getSummary) | **GET** /stats/summary | getSummary


## Documentation for Models

 - [DatasetStats](docs/DatasetStats.md)
 - [EntrystringSetstring](docs/EntrystringSetstring.md)
 - [Feature](docs/Feature.md)
 - [LocatedPeptide](docs/LocatedPeptide.md)
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



