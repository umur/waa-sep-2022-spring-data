package edu.miu.lab_3.controller;

import edu.miu.lab_3.entity.Address;
import lombok.RequiredArgsConstructor;
import edu.miu.lab_3.dto.AddressDto;
import edu.miu.lab_3.service.imp.AddressServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    @Autowired
    private final AddressServiceImp addressService;
    @GetMapping("")
    public List<AddressDto> findAll() {
        return addressService.findAll();
    }


    @GetMapping("/{id}/")
    public AddressDto findAddressById(@PathVariable int id) {
        return addressService.findAddressById(id);
    }

    @PostMapping
    public void save(@RequestBody Address address) {
         addressService.save(address);
    }
    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable int id){
         addressService.deleteAddressById(id);
    }
    @PutMapping("/{id}")
    public Address updateAddress(int id, Address address) {
        AddressDto addressDto1 = addressService.findAddressById(id);
        addressService.deleteAddressById(id);
        addressService.save(address);
        return address;
    }
}
