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
            },
            {
                "useremailid": 12,
                "useremail": "admin@mymail.local"
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
            },
            {
                "role": {
                    "roleid": 3,
                    "name": "DATA"
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
            },
            {
                "plantid": 7,
                "nickname": "Giant Timber Bamboo",
                "species": "Bamboo",
                "waterfrequency": "5x weekly",
                "imgurl": "https://images.unsplash.com/photo-1510398462662-b28a5183460d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80"
            },
            {
                "plantid": 8,
                "nickname": "ShamePlant",
                "species": "Mimosa Pudica",
                "waterfrequency": "Keep Soil Moist, but not water logged",
                "imgurl": "https://images.unsplash.com/photo-1573692822546-99d57af10a33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"
            },
            {
                "plantid": 9,
                "nickname": "Cattleya Orchid",
                "species": "Orchid",
                "waterfrequency": "Water when potting Medium is dry",
                "imgurl": "https://images.unsplash.com/photo-1534885320675-b08aa131cc5e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"
            },
            {
                "plantid": 10,
                "nickname": "ButterHead Lettuce",
                "species": "Lettuce",
                "waterfrequency": "twice weekly",
                "imgurl": "https://images.unsplash.com/photo-1556801712-76c8eb07bbc9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=925&q=80"
            }
        ]
    }
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


