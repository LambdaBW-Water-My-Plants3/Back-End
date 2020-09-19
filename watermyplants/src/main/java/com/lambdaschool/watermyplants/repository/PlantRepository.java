package com.lambdaschool.watermyplants.repository;

import com.lambdaschool.watermyplants.models.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant,Long> {
}
