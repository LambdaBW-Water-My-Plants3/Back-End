## WATER MY PLANTS API

# Description
App that will Streamline plant watering for Users

# Base Url
https://watermyplantunit4.herokuapp.com/

## Documentation For Models/Objects

 - [Plant](docs/Plant.md)
 - [Role](docs/Role.md)
 - [User](docs/User.md)
 - [UserMinimum](docs/UserMinimum.md)
 - [UserRoles](docs/UserRoles.md)
 - [Useremail](docs/Useremail.md)


## Documentation For Authorization

 All endpoints That do not require authorization.
 
 Method | HTTP request | Object Expected
 ------------- | ------------- | -------------
**POST**  | /signup | User or UserMinimum
**POST** | /login | username & password


ALL endpoints That NEED authorization

# PLANT API

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**POST**](PlantControllerApi.md#addNewPlantUsingPOST) | plants/plant | addNewPlant
[**DELETE**](PlantControllerApi.md#deletePlantByIdUsingDELETE) | /plants/plant/delete/{plantid} | deletePlantById
[**GET**](PlantControllerApi.md#findPlantByNameLikeUsingGET) | /plants/plant/withname/{plantname} | findPlantByNameLike
[**GET**](PlantControllerApi.md#getPlantByIdUsingGET) | /plants/plant/id/{plantid} | getPlantById
[**GET**](PlantControllerApi.md#getPlantByNameUsingGET) | /plants/plant/{plantname} | getPlantByName
[**GET**](PlantControllerApi.md#getPlantBySpeciesLikeUsingGET) | /plants/plant/withspecies/{species} | getPlantBySpeciesLike
[**GET**](PlantControllerApi.md#getPlantBySpeciesUsingGET) | /plants/plant/species/{species} | getPlantBySpecies
[**GET**](PlantControllerApi.md#listAllPlantsUsingGET) |  /plants/plants | listAllPlants
[**PUT**](PlantControllerApi.md#updateFullUserUsingPUT) |  /plants/plant/{plantid} | updateFullUser

# USERAPI

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**POST**](UserControllerApi.md#addNewUserUsingPOST) | /users/user | addNewUser
[**DELETE**](UserControllerApi.md#deleteUserByIdUsingDELETE) | /users/user/{id} | deleteUserById
[**GET**](UserControllerApi.md#getCurrentUserInfoUsingGET) |  /users/getuserinfo | returns the currently authenticated user
[**GET**](UserControllerApi.md#getUserByIdUsingGET) | /users/user/{userId} | getUserById
[**GET**](UserControllerApi.md#getUserByNameUsingGET) | /users/user/name/{userName} | getUserByName
[**GET**](UserControllerApi.md#getUserLikeNameUsingGET) | /users/user/name/like/{userName} | getUserLikeName
[**GET**](UserControllerApi.md#listAllUsersUsingGET) |  /users/users | listAllUsers
[**PUT1**](UserControllerApi.md#updateFullUserUsingPUT1) |  /users/user/{userid} | updateFullUser
[**PATCH**](UserControllerApi.md#updateUserUsingPATCH) |  /users/user/{id} | updateUser


# JSON
Sample Json User Object
---
```json
{
        "userid": 500,
        "username": "doggy",
        "primaryemail": "doggyadmin@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 11,
                "useremail": "admin@dog.local"
            },
            {
                "useremailid": 12,
                "useremail": "admin@cat.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 1,
                    "name": "ADMIN"
                }
            }
        ],
        "plants": [
            {
                "plantid": 5,
                "nickname": "Bunny Ears Cactus",
                "species": "Cactus",
                "waterfrequency": "1x weekly",
                "imgurl": "https://images.unsplash.com/photo-1573692822546-99d57af10a33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"
            }
        ]
    }
```
