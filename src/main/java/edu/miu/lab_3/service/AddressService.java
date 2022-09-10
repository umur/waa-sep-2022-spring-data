package edu.miu.lab_3.service;

import edu.miu.lab_3.dto.AddressDto;
import edu.miu.lab_3.entity.Address;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAll();
    AddressDto findAddressById(int id);
    void deleteAddressById(int id);
    void save(Address address);
    AddressDto updateAddress(int id, AddressDto addressDto);

}
