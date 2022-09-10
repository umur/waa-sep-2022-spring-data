package com.springdata.springdata.controller;

import com.springdata.springdata.DTOs.AddressDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.springdata.springdata.service.AddressService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public AddressDTO save(@RequestBody AddressDTO address) {
        return addressService.save(address);
    }

    @GetMapping
    public List<AddressDTO> findAll() {
        return addressService.findAll();
    }

    @PutMapping("/{id}")
    public AddressDTO update(@PathVariable int id, @RequestBody AddressDTO address) {
        return addressService.update(id, address);
    }

    @DeleteMapping("/{id}")
    public  AddressDTO delete(@PathVariable int id) {
        return addressService.delete(id);
    }
}
