package edu.miu.lab_3.controller;

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
    @GetMapping
    public List<AddressDto> findAll() {
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public AddressDto findAddressById(@PathVariable int id) {
        return addressService.findAddressById(id);
    }

    @PostMapping
    public AddressDto save(@RequestBody AddressDto addressDto) {
        return addressService.save(addressDto);
    }
    @DeleteMapping("/{id}")
    public AddressDto deleteAddress(int id){
        return addressService.deleteAddressById(id);
    }
    @PutMapping("/{id}")
    public AddressDto updateAddress(int id, AddressDto addressDto) {
        return addressService.updateAddress(id, addressDto);
    }
}
