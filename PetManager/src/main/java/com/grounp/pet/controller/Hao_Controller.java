package com.grounp.pet.controller;

import com.grounp.pet.pojo.Pet;
import com.grounp.pet.service.Pet_Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author 蒿雨
 * @create 2020-09-20 11:39
 */
@Controller
public class Hao_Controller {
    @Resource(name = "ps")
    Pet_Service pet_service;

    @RequestMapping("/add")
    public String add(Pet pet) {
        int a = pet_service.add(pet);
        if (a != 0) {
            System.out.println("添加成功！");
            return "";
        } else {
            return "";
        }

    }
}
