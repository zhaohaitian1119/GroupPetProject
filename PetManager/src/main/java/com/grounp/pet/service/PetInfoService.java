package com.grounp.pet.service;

import com.grounp.pet.pojo.Pet;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-21 13:27
 */
public interface PetInfoService {
    List<Pet> selAll();
    List<Pet> selByBreed(String breed);
}
