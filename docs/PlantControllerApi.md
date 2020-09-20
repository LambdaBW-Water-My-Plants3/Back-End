# PlantControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewPlantUsingPOST**](PlantControllerApi.md#addNewPlantUsingPOST) | **POST** /plants/plant | addNewPlant
[**deletePlantByIdUsingDELETE**](PlantControllerApi.md#deletePlantByIdUsingDELETE) | **DELETE** /plants/plant/delete/{plantid} | deletePlantById
[**findPlantByNameLikeUsingGET**](PlantControllerApi.md#findPlantByNameLikeUsingGET) | **GET** /plants/plant/withname/{plantname} | findPlantByNameLike
[**getPlantByIdUsingGET**](PlantControllerApi.md#getPlantByIdUsingGET) | **GET** /plants/plant/id/{plantid} | getPlantById
[**getPlantByNameUsingGET**](PlantControllerApi.md#getPlantByNameUsingGET) | **GET** /plants/name/{plantname} | getPlantByName
[**getPlantBySpeciesLikeUsingGET**](PlantControllerApi.md#getPlantBySpeciesLikeUsingGET) | **GET** /plants/plant/withspecies/{species} | getPlantBySpeciesLike
[**getPlantBySpeciesUsingGET**](PlantControllerApi.md#getPlantBySpeciesUsingGET) | **GET** /plants/plant/species/{species} | getPlantBySpecies
[**listAllPlantsUsingGET**](PlantControllerApi.md#listAllPlantsUsingGET) | **GET** /plants/plants | listAllPlants
[**updateFullUserUsingPUT**](PlantControllerApi.md#updateFullUserUsingPUT) | **PUT** /plants/plant/{plantid} | updateFullUser


## **addNewPlantUsingPOST**

addNewPlant

### Example
```bash
 addNewPlantUsingPOST
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newplant** | [**Plant**](Plant.md) | newplant |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deletePlantByIdUsingDELETE**

deletePlantById

### Example
```bash
 deletePlantByIdUsingDELETE plantid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plantid** | **integer** | plantid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **findPlantByNameLikeUsingGET**

findPlantByNameLike

### Example
```bash
 findPlantByNameLikeUsingGET plantname=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plantname** | **string** | plantname |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getPlantByIdUsingGET**

getPlantById

### Example
```bash
 getPlantByIdUsingGET plantid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plantid** | **integer** | plantid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getPlantByNameUsingGET**

getPlantByName

### Example
```bash
 getPlantByNameUsingGET plantname=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plantname** | **string** | plantname |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getPlantBySpeciesLikeUsingGET**

getPlantBySpeciesLike

### Example
```bash
 getPlantBySpeciesLikeUsingGET species=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **string** | species |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getPlantBySpeciesUsingGET**

getPlantBySpecies

### Example
```bash
 getPlantBySpeciesUsingGET species=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **string** | species |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllPlantsUsingGET**

listAllPlants

### Example
```bash
 listAllPlantsUsingGET
```

### Parameters
This endpoint does not need any parameter.

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateFullUserUsingPUT**

updateFullUser

### Example
```bash
 updateFullUserUsingPUT plantid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plantid** | **integer** | plantid |
 **updatePlant** | [**Plant**](Plant.md) | updatePlant |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

