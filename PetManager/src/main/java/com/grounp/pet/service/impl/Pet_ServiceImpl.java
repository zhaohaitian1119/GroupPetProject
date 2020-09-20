package com.grounp.pet.service.impl;

import com.grounp.pet.mapper.PetMapper;
import com.grounp.pet.pojo.Pet;
import com.grounp.pet.service.Pet_Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 蒿雨
 * @create 2020-09-20 11:19
 */
@Service("ps")
public class Pet_ServiceImpl implements Pet_Service {
    @Resource
    PetMapper petMapper;

    @Override
    public int add(Pet pet) {
        return petMapper.insertSelective(pet);
    }
}
