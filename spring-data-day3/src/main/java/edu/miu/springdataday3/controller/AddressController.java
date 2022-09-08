package edu.miu.springdataday3.controller;

import edu.miu.springdataday3.entitiy.Address;
import edu.miu.springdataday3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public Address findByID(@PathVariable int id) {
        return addressService.findByID(id);
    }

    @PostMapping
    public void save(@RequestBody Address address) {
        addressService.save(address);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        addressService.deleteById(id);
    }

}
