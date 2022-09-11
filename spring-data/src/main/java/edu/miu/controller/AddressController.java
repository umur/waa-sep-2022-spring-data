package edu.miu.controller;

import edu.miu.entity.Address;
import edu.miu.service.impl.AddressServiceImpl;
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