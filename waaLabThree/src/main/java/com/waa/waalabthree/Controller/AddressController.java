package com.waa.waalabthree.Controller;

import com.waa.waalabthree.Entity.Address;
import com.waa.waalabthree.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/allAddress")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("/allAddress/{id}")
    public Optional<Address> getAddressById(@PathVariable int id){
        return addressService.getAddressById(id);
    }

    @DeleteMapping("/allAddress")
    public void deleteAddress(){
        addressService.deleteAddress();
    }

    @DeleteMapping("/allAddress/{id}")
    public void deleteAddressById(@PathVariable int id){
        addressService.deleteAddressById(id);
    }

    @PostMapping("/allAddress")
    public Address createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

    @PutMapping("/allAddress/{id}")
    public Address updateAddress(@PathVariable int id, @RequestBody Address address){
        return addressService.updateAddress(id, address);
    }

}
