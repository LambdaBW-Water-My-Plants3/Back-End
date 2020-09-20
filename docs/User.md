# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **string** |  | [optional] [default to null]
**passwordNoEncrypt** | **string** |  | [optional] [default to null]
**plants** | [**array[Plant]**](Plant.md) |  | [optional] [default to null]
**primaryemail** | **string** |  | [optional] [default to null]
**roles** | [**array[UserRoles]**](UserRoles.md) |  | [optional] [default to null]
**useremails** | [**array[Useremail]**](Useremail.md) |  | [optional] [default to null]
**userid** | **integer** |  | [optional] [default to null]
**username** | **string** |  | [optional] [default to null]

# Json Object
---
```json

 {
        "userid": 4,
        "username": "admin",
        "primaryemail": "admin@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 11,
                "useremail": "admin@email.local"
            }

        ],
        "roles": [
            {
                "role": {
                    "roleid": 1,
                    "name": "ADMIN"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
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
            },
            {
                "plantid": 6,
                "nickname": "Jumping Chola",
                "species": "Cactus",
                "waterfrequency": "1x weekly",
                "imgurl": "https://images.unsplash.com/photo-1539571711714-62cd2534f96e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1267&q=80"
            }
        ]
    }
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


