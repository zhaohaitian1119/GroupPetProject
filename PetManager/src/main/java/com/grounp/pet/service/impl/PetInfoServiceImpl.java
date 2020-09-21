package com.grounp.pet.service.impl;

import com.grounp.pet.mapper.PetMapper;
import com.grounp.pet.pojo.Pet;
import com.grounp.pet.pojo.PetExample;
import com.grounp.pet.service.PetInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-21 13:28
 */
@Service("petInfoService")
public class PetInfoServiceImpl implements PetInfoService{

    @Resource
    PetMapper petMapper;

    @Override
    public List<Pet> selAll() {
        List<Pet> pets = petMapper.selectByExample(null);
        return pets;
    }

    @Override
    public List<Pet> selByBreed(String breed) {
        PetExample example = new PetExample();
        PetExample.Criteria criteria = example.createCriteria();
        criteria.andPetBreedEqualTo(breed);
        List<Pet> pets = petMapper.selectByExample(example);
        return pets;
    }
}
