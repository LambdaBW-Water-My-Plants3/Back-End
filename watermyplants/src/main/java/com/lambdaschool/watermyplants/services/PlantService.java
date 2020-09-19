package com.lambdaschool.watermyplants.services;

import com.lambdaschool.watermyplants.models.Plant;

import java.util.List;

public interface PlantService {

    List<Plant> findAll();
    List<Plant> findByNameContaining(String nickname);
    List<Plant> findBySpecies(String species);
    List<Plant> findBySpeciesContaining(String species);
    Plant findByPlantId(long id);
    Plant findByName(String nickname);
    void delete(long id);
    Plant save(Plant plant);
    Plant update(Plant plant, long id);

}
