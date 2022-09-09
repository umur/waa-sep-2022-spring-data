package edu.miu.lab_3.service;

import edu.miu.lab_3.dto.AddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAll();
    AddressDto findAddressById(int id);
    AddressDto deleteAddressById(int id);
    AddressDto save(AddressDto addressDto);
    AddressDto updateAddress(int id, AddressDto addressDto);

}
