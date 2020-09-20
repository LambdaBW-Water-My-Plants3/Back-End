package com.lambdaschool.watermyplants.services;

import com.lambdaschool.watermyplants.exceptions.ResourceNotFoundException;
import com.lambdaschool.watermyplants.models.Plant;
import com.lambdaschool.watermyplants.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
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

        List<Plant> list = new ArrayList<>();
        plantrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<Plant> findByNameContaining(String nickname) {
        return plantrepos.findByNicknameContainingIgnoreCase(nickname.toLowerCase());
    }

    @Override
    public List<Plant> findBySpecies(String species) {

        return plantrepos.findAllBySpeciesIgnoreCase(species.toLowerCase());
    }

    @Override
    public List<Plant> findBySpeciesContaining(String species) {

        return plantrepos.findBySpeciesContainingIgnoreCase(species.toLowerCase());
    }

    @Override
    public Plant findByPlantId(long id) throws ResourceNotFoundException {

        return plantrepos.findById(id).orElseThrow(()-> new ResourceNotFoundException("Plant with id:" + id + "not found!"));
    }

    @Override
    public Plant findByName(String nickname) {

        Plant pp = plantrepos.findByNickname(nickname.toLowerCase());
        if(pp == null){
            throw new ResourceNotFoundException(nickname + "not found!");
        }
        return pp;
    }
    @Transactional
    @Override
    public void delete(long id) {
        plantrepos.findById(id).orElseThrow(()-> new ResourceNotFoundException("Plant id :" + id + " Not Found!"));
        plantrepos.deleteById(id);
    }

    @Transactional
    @Override
    public Plant save(Plant plant) {

        Plant newPlant = new Plant();
        if(plant.getPlantid() != 0 ){
            plantrepos.findById(plant.getPlantid()).orElseThrow(()->
                    new ResourceNotFoundException("Plant with id:" + plant.getPlantid() + "not found!"));
            newPlant.setPlantid(plant.getPlantid());
        }
        newPlant.setImgurl(plant.getImgurl());
        newPlant.setNickname(plant.getNickname());
        newPlant.setSpecies(plant.getSpecies());
        newPlant.setWaterfrequency(plant.getWaterfrequency());
        newPlant.setUser(plant.getUser());

        return plantrepos.save(newPlant);
    }

    @Transactional
    @Override
    public Plant update(Plant plant, long id) {

        Plant currentPlant = findByPlantId(id);

        if(plant.getImgurl() != null){
            currentPlant.setImgurl(plant.getImgurl());
        }
        if(plant.getNickname() != null){
            currentPlant.setNickname(plant.getNickname());
        }
        if(plant.getSpecies() != null){
            currentPlant.setSpecies(plant.getSpecies());
        }
        if(plant.getWaterfrequency() != null){
            currentPlant.setWaterfrequency(plant.getWaterfrequency());
        }
        if(plant.getUser() != null){
            currentPlant.setUser(plant.getUser());
        }

        return plantrepos.save(currentPlant);

    }
}
