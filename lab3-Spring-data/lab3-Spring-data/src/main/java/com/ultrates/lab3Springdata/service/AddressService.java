package com.ultrates.lab3Springdata.service;

import com.ultrates.lab3Springdata.dto.AddressDto;

import java.util.List;

public interface AddressService {

    void save(AddressDto p);
    void deleteById(int id);
    AddressDto getById(int id);
    List<AddressDto> getAll();

}
