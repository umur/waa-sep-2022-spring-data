package com.example.dayThree.controller;

import com.example.dayThree.Service.CatagoryService;
import com.example.dayThree.entity.Address;
import com.example.dayThree.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catagory")
public class CatagoryController {
    @Autowired
    CatagoryService catagoryService;

    @GetMapping
    public List<Category> listOfCatagory(){
       return catagoryService.allCatagory();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCatagoryById(@PathVariable long id){
        return catagoryService.getCatagoryById(id);
    }
}
