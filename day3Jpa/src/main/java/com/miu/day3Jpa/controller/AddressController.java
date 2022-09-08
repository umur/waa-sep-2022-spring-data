package com.miu.day3Jpa.controller;

import com.miu.day3Jpa.dto.AddressDTO;
import com.miu.day3Jpa.entity.Address;
import com.miu.day3Jpa.service.AddressService;
import com.miu.day3Jpa.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressServiceImpl addressService;

    @GetMapping
    public List<AddressDTO> getAllAddress(){
        return addressService.getAllAddress();
    }
    @PostMapping
    public void saveAddress(@RequestBody AddressDTO addressDTO){
        addressService.saveAddress(addressDTO);
    }
    @PutMapping("/{id}")
    public void updateAddress(@RequestBody AddressDTO addressDTO,@PathVariable int id){
        addressService.updateAddress(addressDTO,id);
    }
    @DeleteMapping("/{id}")
    public void updateAddress(@PathVariable int id){
        addressService.deleteAddress(id);
    }
}
