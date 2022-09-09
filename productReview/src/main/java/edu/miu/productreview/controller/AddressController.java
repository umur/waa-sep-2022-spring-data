package edu.miu.productreview.controller;

import edu.miu.productreview.dto.AddressDto;
import edu.miu.productreview.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/addresses")
public class AddressController {
    private final AddressService addressSvc;

    @PostMapping
    public AddressDto save(@RequestBody AddressDto addressDto) {
        return addressSvc.save(addressDto);
    }

    @GetMapping
    public List<AddressDto> findAll() {
        return addressSvc.findAll();
    }

    @GetMapping("/{id}")
    public AddressDto findById(@PathVariable int id) {
        return addressSvc.findById(id);
    }

    @PutMapping("/{id}")
    public AddressDto update(@PathVariable int id, @RequestBody AddressDto addressDto) {
        return addressSvc.update(id, addressDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        addressSvc.delete(id);
    }
}
