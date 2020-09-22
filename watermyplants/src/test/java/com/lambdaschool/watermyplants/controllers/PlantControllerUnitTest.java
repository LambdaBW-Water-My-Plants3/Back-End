package com.lambdaschool.watermyplants.controllers;

import com.lambdaschool.watermyplants.WaterMyPlants;
import com.lambdaschool.watermyplants.exceptions.ResourceNotFoundException;
import com.lambdaschool.watermyplants.models.Plant;
import com.lambdaschool.watermyplants.models.Role;
import com.lambdaschool.watermyplants.models.User;
import com.lambdaschool.watermyplants.models.UserRoles;
import com.lambdaschool.watermyplants.services.PlantService;
import com.lambdaschool.watermyplants.services.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WaterMyPlants.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlantControllerUnitTest {

    @Autowired
    private PlantService plantService;
    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        List<Plant> myList = plantService.findAll();
        for(Plant p : myList) {
            System.out.println(p.getNickname() + " " + p.getPlantid());
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listAllPlants() {
        assertEquals(8, plantService.findAll().size());
    }


    @Test(expected = ResourceNotFoundException.class)
    public void getPlantByNameNotFound() {
        assertEquals("Romaine Lettuce", plantService.findByName("dog " +
                "Lettuce"));
    }

    @Test
    public void findPlantByNameLike() {
        assertEquals(1, plantService.findByNameContaining("Shame").size());
    }

    @Test
    public void getPlantById() {
        assertEquals("ShamePlant", plantService.findByPlantId(8).getNickname());
    }

    @Test
    public void getPlantBySpecies() {
        assertEquals(2,plantService.findBySpecies("cactus").size());
    }

    @Test
    public void getPlantBySpeciesLike() {
        assertEquals(2,plantService.findBySpecies("cactus").size());
    }

    @Test
    public void z_deletePlantById() {
        plantService.delete(5);
        assertEquals(7,plantService.findAll().size());
    }

}