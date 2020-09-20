# Water My Plants Bash client

## Overview
This is a Bash client script for accessing Water My Plants service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image
You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash
The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X
On OSX you might need to install bash-completion using Homebrew:
```shell
brew install bash-completion
```
and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh
In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.


## Documentation for API Endpoints

All URIs are relative to **

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LogoutControllerApi* | [**logoutSelfUsingGET**](docs/LogoutControllerApi.md#logoutselfusingget) | **GET** /logout | logoutSelf
*LogoutControllerApi* | [**logoutSelfUsingGET1**](docs/LogoutControllerApi.md#logoutselfusingget1) | **GET** /oauth/revoke-token | logoutSelf
*OpenControllerApi* | [**addSelfUsingPOST**](docs/OpenControllerApi.md#addselfusingpost) | **POST** /signup | addSelf
*PlantControllerApi* | [**addNewPlantUsingPOST**](docs/PlantControllerApi.md#addnewplantusingpost) | **POST** /plants/plant | addNewPlant
*PlantControllerApi* | [**deletePlantByIdUsingDELETE**](docs/PlantControllerApi.md#deleteplantbyidusingdelete) | **DELETE** /plants/plant/delete/{plantid} | deletePlantById
*PlantControllerApi* | [**findPlantByNameLikeUsingGET**](docs/PlantControllerApi.md#findplantbynamelikeusingget) | **GET** /plants/plant/withname/{plantname} | findPlantByNameLike
*PlantControllerApi* | [**getPlantByIdUsingGET**](docs/PlantControllerApi.md#getplantbyidusingget) | **GET** /plants/plant/id/{plantid} | getPlantById
*PlantControllerApi* | [**getPlantByNameUsingGET**](docs/PlantControllerApi.md#getplantbynameusingget) | **GET** /plants/name/{plantname} | getPlantByName
*PlantControllerApi* | [**getPlantBySpeciesLikeUsingGET**](docs/PlantControllerApi.md#getplantbyspecieslikeusingget) | **GET** /plants/plant/withspecies/{species} | getPlantBySpeciesLike
*PlantControllerApi* | [**getPlantBySpeciesUsingGET**](docs/PlantControllerApi.md#getplantbyspeciesusingget) | **GET** /plants/plant/species/{species} | getPlantBySpecies
*PlantControllerApi* | [**listAllPlantsUsingGET**](docs/PlantControllerApi.md#listallplantsusingget) | **GET** /plants/plants | listAllPlants
*PlantControllerApi* | [**updateFullUserUsingPUT**](docs/PlantControllerApi.md#updatefulluserusingput) | **PUT** /plants/plant/{plantid} | updateFullUser
*RolesControllerApi* | [**addNewRoleUsingPOST**](docs/RolesControllerApi.md#addnewroleusingpost) | **POST** /roles/role | addNewRole
*RolesControllerApi* | [**getRoleByIdUsingGET**](docs/RolesControllerApi.md#getrolebyidusingget) | **GET** /roles/id/{roleId} | getRoleById
*RolesControllerApi* | [**getRoleByNameUsingGET**](docs/RolesControllerApi.md#getrolebynameusingget) | **GET** /roles/role/name/{roleName} | getRoleByName
*RolesControllerApi* | [**listRolesUsingGET**](docs/RolesControllerApi.md#listrolesusingget) | **GET** /roles/roles | listRoles
*RolesControllerApi* | [**putUpdateRoleUsingPUT**](docs/RolesControllerApi.md#putupdateroleusingput) | **PUT** /roles/role/{roleid} | putUpdateRole
*UserControllerApi* | [**addNewUserUsingPOST**](docs/UserControllerApi.md#addnewuserusingpost) | **POST** /users/user | addNewUser
*UserControllerApi* | [**deleteUserByIdUsingDELETE**](docs/UserControllerApi.md#deleteuserbyidusingdelete) | **DELETE** /users/id/{id} | deleteUserById
*UserControllerApi* | [**getCurrentUserInfoUsingGET**](docs/UserControllerApi.md#getcurrentuserinfousingget) | **GET** /users/getuserinfo | returns the currently authenticated user
*UserControllerApi* | [**getUserByIdUsingGET**](docs/UserControllerApi.md#getuserbyidusingget) | **GET** /users/user/{userId} | getUserById
*UserControllerApi* | [**getUserByNameUsingGET**](docs/UserControllerApi.md#getuserbynameusingget) | **GET** /users/user/name/{userName} | getUserByName
*UserControllerApi* | [**getUserLikeNameUsingGET**](docs/UserControllerApi.md#getuserlikenameusingget) | **GET** /users/user/name/like/{userName} | getUserLikeName
*UserControllerApi* | [**listAllUsersUsingGET**](docs/UserControllerApi.md#listallusersusingget) | **GET** /users/users | listAllUsers
*UserControllerApi* | [**updateFullUserUsingPUT1**](docs/UserControllerApi.md#updatefulluserusingput1) | **PUT** /users/id/{userid} | updateFullUser
*UserControllerApi* | [**updateUserUsingPATCH**](docs/UserControllerApi.md#updateuserusingpatch) | **PATCH** /users/id/{id} | updateUser
*UseremailControllerApi* | [**addNewUserEmailUsingPOST**](docs/UseremailControllerApi.md#addnewuseremailusingpost) | **POST** /useremails/user/{userid}/email/{emailaddress} | addNewUserEmail
*UseremailControllerApi* | [**deleteUserEmailByIdUsingDELETE**](docs/UseremailControllerApi.md#deleteuseremailbyidusingdelete) | **DELETE** /useremails/useremail/{useremailid} | deleteUserEmailById
*UseremailControllerApi* | [**getUserEmailByIdUsingGET**](docs/UseremailControllerApi.md#getuseremailbyidusingget) | **GET** /useremails/email/{useremailId} | getUserEmailById
*UseremailControllerApi* | [**listAllUseremailsUsingGET**](docs/UseremailControllerApi.md#listalluseremailsusingget) | **GET** /useremails/useremails | listAllUseremails
*UseremailControllerApi* | [**updateUserEmailUsingPUT**](docs/UseremailControllerApi.md#updateuseremailusingput) | **PUT** /useremails/useremail/{useremailid}/email/{emailaddress} | updateUserEmail


## Documentation For Models

 - [Plant](docs/Plant.md)
 - [Role](docs/Role.md)
 - [User](docs/User.md)
 - [UserMinimum](docs/UserMinimum.md)
 - [UserRoles](docs/UserRoles.md)
 - [Useremail](docs/Useremail.md)


## Documentation For Authorization

 All endpoints do not require authorization.

