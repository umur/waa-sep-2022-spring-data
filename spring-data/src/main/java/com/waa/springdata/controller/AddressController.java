package com.waa.springdata.controller;

import com.waa.springdata.entity.Address;
import com.waa.springdata.service.impl.AddressServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/addresses")
@RestController
public class AddressController {
    private final AddressServiceImpl addressService;

    public AddressController(AddressServiceImpl addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Address address) {
        addressService.save(address);
    }
}