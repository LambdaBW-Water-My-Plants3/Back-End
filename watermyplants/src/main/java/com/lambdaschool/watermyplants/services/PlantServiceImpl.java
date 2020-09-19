package com.lambdaschool.watermyplants.services;

import com.lambdaschool.watermyplants.models.Plant;
import com.lambdaschool.watermyplants.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service(value = "plantService")
public class PlantServiceImpl implements PlantService{

    @Autowired
    private PlantRepository plantrepos;

    @Autowired
    private HelperFunctions helperFunctions;

    @Override
    public List<Plant> findAll() {
        return null;
    }

    @Override
    public List<Plant> findByNameContaining(String nickname) {
        return null;
    }

    @Override
    public List<Plant> findBySpecies(String species) {
        return null;
    }

    @Override
    public List<Plant> findBySpeciesContaining(String species) {
        return null;
    }

    @Override
    public Plant findByPlantId(long id) {
        return null;
    }

    @Override
    public Plant findByName(String nickname) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Plant save(Plant plant) {
        return null;
    }

    @Override
    public Plant update(Plant plant, long id) {
        return null;
    }
}
