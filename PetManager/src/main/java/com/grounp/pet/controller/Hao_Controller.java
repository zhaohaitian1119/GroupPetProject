package com.grounp.pet.controller;

import com.grounp.pet.pojo.Pet;
import com.grounp.pet.service.PetInfoService;
import com.grounp.pet.service.Pet_Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 蒿雨
 * @create 2020-09-20 11:39
 */
@Controller
public class Hao_Controller {
    @Resource(name = "ps")
    Pet_Service pet_service;

    @Resource
    PetInfoService petInfoService;


    @RequestMapping("/")
    public String info(Model model, HttpServletRequest request){

        String breed = request.getParameter("petBreed");
        if(breed == null || breed.equals("0")){
            List<Pet> pets = petInfoService.selAll();
            for (Pet pet : pets) {
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

                java.util.Date date=new java.util.Date();
                Date birthday = pet.getBirthday();
                pet.setDatetime(sdf.format(birthday));

            }
            model.addAttribute("pets",pets);
        }else{
            List<Pet> pets = petInfoService.selByBreed(breed);
            for (Pet pet : pets) {
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

                java.util.Date date=new java.util.Date();
                Date birthday = pet.getBirthday();
                pet.setDatetime(sdf.format(birthday));

            }
            request.setAttribute("breed",breed);
            model.addAttribute("pets",pets);
        }

        return "index";
    }


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
            return "redirect:/";
        } else {
            return "redirect:/";
        }

    }
}
