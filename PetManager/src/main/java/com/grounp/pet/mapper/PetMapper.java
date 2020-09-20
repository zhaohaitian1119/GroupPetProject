package com.grounp.pet.mapper;

import com.grounp.pet.pojo.Pet;
import com.grounp.pet.pojo.PetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetMapper {
    int countByExample(PetExample example);

    int deleteByExample(PetExample example);

    int deleteByPrimaryKey(Integer petId);

    int insert(Pet record);

    int insertSelective(Pet record);

    List<Pet> selectByExample(PetExample example);

    Pet selectByPrimaryKey(Integer petId);

    int updateByExampleSelective(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByExample(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByPrimaryKeySelective(Pet record);

    int updateByPrimaryKey(Pet record);
}