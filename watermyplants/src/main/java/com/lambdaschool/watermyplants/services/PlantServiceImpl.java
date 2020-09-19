package com.lambdaschool.watermyplants.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "plantService")
public class PlantServiceImpl implements PlantService{
}
