package com.lambdaschool.watermyplants.services;

import com.lambdaschool.watermyplants.WaterMyPlants;
import com.lambdaschool.watermyplants.models.Plant;
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
public class PlantServiceImplTest {

    @Autowired
    private PlantService plantService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        List<Plant> myList = plantService.findAll();
        for(Plant p : myList){
            System.out.println(p.getNickname() + " " + p.getPlantid() + " " + p.getSpecies());
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        assertEquals(8, plantService.findAll().size());
    }

    @Test
    public void findByNameContaining() {
        assertEquals(1, plantService.findByNameContaining("bunny").size());
    }

    @Test
    public void findBySpecies() {
        assertEquals(2, plantService.findBySpecies("Cactus").size());
    }

    @Test
    public void findBySpeciesContaining() {
        assertEquals(2, plantService.findBySpeciesContaining("Cac").size());
    }

    @Test
    public void findByPlantId() {
        assertEquals("ShamePlant", plantService.findByPlantId(8).getNickname());
    }

    @Test
    public void z_delete() {
        plantService.delete(5);
        assertEquals(7,plantService.findAll().size());
    }

}