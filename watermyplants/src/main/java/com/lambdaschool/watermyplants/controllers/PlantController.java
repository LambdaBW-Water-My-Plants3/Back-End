package com.lambdaschool.watermyplants.controllers;

import com.lambdaschool.watermyplants.models.Plant;
import com.lambdaschool.watermyplants.models.User;
import com.lambdaschool.watermyplants.services.PlantService;
import com.lambdaschool.watermyplants.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        return new ResponseEntity<>(plantname,
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
        Plant myPlant = plantService.findByName(plantname);
        return new ResponseEntity<>(plantname,
                HttpStatus.OK);
    }
    
}
