package com.grounp.pet.controller;

import com.grounp.pet.pojo.Pet;
import com.grounp.pet.service.Pet_Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 蒿雨
 * @create 2020-09-20 11:39
 */
@Controller
public class Hao_Controller {
    @Resource(name = "ps")
    Pet_Service pet_service;

    @RequestMapping("/add")
    public String add(String petName, String petBreed,String petSex, String birthday, String description) {
        Pet pet = new Pet();
        pet.setPetName(petName);
        pet.setPetBreed(petBreed);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        pet.setBirthday(date);
        pet.setPetSex(petSex);
        pet.setDescription(description);
        int a = pet_service.add(pet);
        if (a != 0) {
            System.out.println("添加成功！");
            return "";
        } else {
            return "";
        }

    }
}
