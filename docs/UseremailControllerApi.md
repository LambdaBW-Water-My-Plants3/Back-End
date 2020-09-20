# UseremailControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewUserEmailUsingPOST**](UseremailControllerApi.md#addNewUserEmailUsingPOST) | **POST** /useremails/user/{userid}/email/{emailaddress} | addNewUserEmail
[**deleteUserEmailByIdUsingDELETE**](UseremailControllerApi.md#deleteUserEmailByIdUsingDELETE) | **DELETE** /useremails/useremail/{useremailid} | deleteUserEmailById
[**getUserEmailByIdUsingGET**](UseremailControllerApi.md#getUserEmailByIdUsingGET) | **GET** /useremails/email/{useremailId} | getUserEmailById
[**listAllUseremailsUsingGET**](UseremailControllerApi.md#listAllUseremailsUsingGET) | **GET** /useremails/useremails | listAllUseremails
[**updateUserEmailUsingPUT**](UseremailControllerApi.md#updateUserEmailUsingPUT) | **PUT** /useremails/useremail/{useremailid}/email/{emailaddress} | updateUserEmail


## **addNewUserEmailUsingPOST**

addNewUserEmail

### Example
```bash
 addNewUserEmailUsingPOST emailaddress=value userid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailaddress** | **string** | emailaddress |
 **userid** | **integer** | userid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteUserEmailByIdUsingDELETE**

deleteUserEmailById

### Example
```bash
 deleteUserEmailByIdUsingDELETE useremailid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **useremailid** | **integer** | useremailid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUserEmailByIdUsingGET**

getUserEmailById

### Example
```bash
 getUserEmailByIdUsingGET useremailId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **useremailId** | **integer** | useremailId |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllUseremailsUsingGET**

listAllUseremails

### Example
```bash
 listAllUseremailsUsingGET
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

## **updateUserEmailUsingPUT**

updateUserEmail

### Example
```bash
 updateUserEmailUsingPUT emailaddress=value useremailid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailaddress** | **string** | emailaddress |
 **useremailid** | **integer** | useremailid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

