package com.lambdaschool.watermyplants.repository;

import com.lambdaschool.watermyplants.models.Plant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlantRepository extends CrudRepository<Plant,Long> {

    List<Plant> findByNicknameContainingIgnoreCase(String name);
    List<Plant> findBySpeciesContainingIgnoreCase(String name);
    List<Plant> findAllBySpeciesIgnoreCase(String name);
    Plant findByNickname(String name);
}
