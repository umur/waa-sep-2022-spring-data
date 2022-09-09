package com.example.assignment3.controller;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.expection.ResourceNotFoundException;
import com.example.assignment3.service.AddressService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/address")
@RestController
@Slf4j
@Api("address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated AddressDto addressDto) {
        addressService.save(addressDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> findById(@PathVariable("id") Long id) {
        AddressDto address = addressService.findById(id);
        return ResponseEntity.ok(address);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        Optional.ofNullable(addressService.findById(id)).orElseThrow(() -> {
            log.error("Unable to delete non-existent data！");
            return new ResourceNotFoundException();
        });
        addressService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/filter")
    public ResponseEntity<Page<AddressDto>> pageQuery(AddressDto addressDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<AddressDto> addressPage = addressService.findByCondition(addressDto, pageable);
        return ResponseEntity.ok(addressPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressDto> update(@RequestBody @Validated AddressDto addressDto, @PathVariable("id") Long id) {
        AddressDto updatedAddress = addressService.update(addressDto, id);
        return ResponseEntity.ok(updatedAddress);
    }
}