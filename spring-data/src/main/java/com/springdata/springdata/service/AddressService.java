package com.springdata.springdata.service;

import com.springdata.springdata.DTOs.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO save (AddressDTO address);
    List<AddressDTO> findAll();
    AddressDTO findOne(int id);
    AddressDTO update(int id, AddressDTO address);
    AddressDTO delete(int id);
}
