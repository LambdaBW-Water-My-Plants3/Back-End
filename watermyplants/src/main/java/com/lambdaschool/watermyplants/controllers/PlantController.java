package com.lambdaschool.watermyplants.controllers;

import com.lambdaschool.watermyplants.models.Plant;
import com.lambdaschool.watermyplants.models.User;
import com.lambdaschool.watermyplants.models.UserRoles;
import com.lambdaschool.watermyplants.services.PlantService;
import com.lambdaschool.watermyplants.services.UserService;
import org.h2.table.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("plants")
public class PlantController {

    @Autowired
    private UserService userService;

    @Autowired
    private PlantService plantService;

    @GetMapping(value = "/plants",
            produces = "application/json")
    public ResponseEntity<?> listAllPlants()
    {
        List<Plant> myPlants = plantService.findAll();
        return new ResponseEntity<>(myPlants,
                HttpStatus.OK);
    }

    @GetMapping(value = "/plant/{plantname}",
            produces = "application/json")
    public ResponseEntity<?> getPlantByName(@PathVariable String plantname)
    {
        Plant myPlant = plantService.findByName(plantname);
        return new ResponseEntity<>(myPlant,
                HttpStatus.OK);
    }

    @GetMapping(value = "/plant/{plantname}",
            produces = "application/json")
    public ResponseEntity<?> findPlantByNameLike(@PathVariable String plantname)
    {
        List<Plant> myPlants = plantService.findByNameContaining(plantname);
        return new ResponseEntity<>(myPlants,
                HttpStatus.OK);
    }

    @GetMapping(value = "/plant/{plantid}",
            produces = "application/json")
    public ResponseEntity<?> getPlantById(@PathVariable Long plantid)
    {
        Plant myPlant = plantService.findByPlantId(plantid);
        return new ResponseEntity<>(myPlant,
                HttpStatus.OK);
    }

    @GetMapping(value = "/plant/{species}",
            produces = "application/json")
    public ResponseEntity<?> getPlantBySpecies(@PathVariable String species)
    {
        List<Plant> myPlants = plantService.findBySpecies(species);
        return new ResponseEntity<>(myPlants,
                HttpStatus.OK);
    }

    @GetMapping(value = "/plant/{species}",
            produces = "application/json")
    public ResponseEntity<?> getPlantBySpeciesLike(@PathVariable String species)
    {
        List<Plant> myPlants = plantService.findBySpeciesContaining(species);
        return new ResponseEntity<>(myPlants,
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/plant/{plantid}")
    public ResponseEntity<?> deletePlantById(
            @PathVariable
                    long plantid)
    {
        plantService.delete(plantid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/plant",
            consumes = "application/json")
    public ResponseEntity<?> addNewPlant(
            @Valid
            @RequestBody
                    Plant newplant) throws
            URISyntaxException
    {
        newplant.setPlantid(0);
        newplant = plantService.save(newplant);

        // set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newUserURI = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{userid}")
                .buildAndExpand(newplant.getPlantid())
                .toUri();
        responseHeaders.setLocation(newUserURI);

        return new ResponseEntity<>(null,
                responseHeaders,
                HttpStatus.CREATED);
    }

    @PutMapping(value = "/plant/{plantid}",
            consumes = "application/json")
    public ResponseEntity<?> updateFullUser(
            @Valid
            @RequestBody
                    Plant updatePlant,
            @PathVariable
                    long plantid)
    {
        updatePlant.setPlantid(plantid);
        plantService.save(updatePlant);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
