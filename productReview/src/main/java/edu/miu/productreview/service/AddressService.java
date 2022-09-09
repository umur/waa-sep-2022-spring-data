package edu.miu.productreview.service;

import edu.miu.productreview.domain.Address;
import edu.miu.productreview.dto.AddressDto;

import java.util.List;

public interface AddressService {
    //crud
    AddressDto save(AddressDto address);
    List<AddressDto> findAll();
    AddressDto findById(int id);
    AddressDto update(int id, AddressDto addressDto);
    void delete(int id);
}
