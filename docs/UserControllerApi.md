# UserControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewUserUsingPOST**](UserControllerApi.md#addNewUserUsingPOST) | **POST** /users/user | addNewUser
[**deleteUserByIdUsingDELETE**](UserControllerApi.md#deleteUserByIdUsingDELETE) | **DELETE** /users/id/{id} | deleteUserById
[**getCurrentUserInfoUsingGET**](UserControllerApi.md#getCurrentUserInfoUsingGET) | **GET** /users/getuserinfo | returns the currently authenticated user
[**getUserByIdUsingGET**](UserControllerApi.md#getUserByIdUsingGET) | **GET** /users/user/{userId} | getUserById
[**getUserByNameUsingGET**](UserControllerApi.md#getUserByNameUsingGET) | **GET** /users/user/name/{userName} | getUserByName
[**getUserLikeNameUsingGET**](UserControllerApi.md#getUserLikeNameUsingGET) | **GET** /users/user/name/like/{userName} | getUserLikeName
[**listAllUsersUsingGET**](UserControllerApi.md#listAllUsersUsingGET) | **GET** /users/users | listAllUsers
[**updateFullUserUsingPUT1**](UserControllerApi.md#updateFullUserUsingPUT1) | **PUT** /users/id/{userid} | updateFullUser
[**updateUserUsingPATCH**](UserControllerApi.md#updateUserUsingPATCH) | **PATCH** /users/id/{id} | updateUser


## **addNewUserUsingPOST**

addNewUser

### Example
```bash
 addNewUserUsingPOST
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newuser** | [**User**](User.md) | newuser |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteUserByIdUsingDELETE**

deleteUserById

### Example
```bash
 deleteUserByIdUsingDELETE id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **integer** | id |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getCurrentUserInfoUsingGET**

returns the currently authenticated user

### Example
```bash
 getCurrentUserInfoUsingGET  authenticated=value  authorities[0].authority=value  Specify as:   Specify as:   Specify as: 
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **boolean** |  | [optional]
 **authorities[0].authority** | **string** |  | [optional]
 **credentials** | [**map[String, string]**](string.md) |  | [optional]
 **details** | [**map[String, string]**](string.md) |  | [optional]
 **principal** | [**map[String, string]**](string.md) |  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUserByIdUsingGET**

getUserById

### Example
```bash
 getUserByIdUsingGET userId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **integer** | userId |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUserByNameUsingGET**

getUserByName

### Example
```bash
 getUserByNameUsingGET userName=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **string** | userName |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUserLikeNameUsingGET**

getUserLikeName

### Example
```bash
 getUserLikeNameUsingGET userName=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **string** | userName |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllUsersUsingGET**

listAllUsers

### Example
```bash
 listAllUsersUsingGET
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

## **updateFullUserUsingPUT1**

updateFullUser

### Example
```bash
 updateFullUserUsingPUT1 userid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUser** | [**User**](User.md) | updateUser |
 **userid** | **integer** | userid |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateUserUsingPATCH**

updateUser

### Example
```bash
 updateUserUsingPATCH id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **integer** | id |
 **updateUser** | [**User**](User.md) | updateUser |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

