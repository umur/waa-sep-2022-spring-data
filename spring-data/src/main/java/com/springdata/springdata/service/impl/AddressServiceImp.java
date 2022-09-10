package com.springdata.springdata.service.impl;

import com.springdata.springdata.DTOs.AddressDTO;
import lombok.RequiredArgsConstructor;
import com.springdata.springdata.models.Address;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springdata.springdata.repository.AddressRepo;
import com.springdata.springdata.service.AddressService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImp implements AddressService {

    @Autowired
    private AddressRepo addressRepo;
    private final ModelMapper mapper;

    @Override
    public AddressDTO save(AddressDTO address) {
        Address mappedAddress = mapper.map(address, Address.class);
        return mapper.map(addressRepo.save(mappedAddress), AddressDTO.class);
    }

    @Override
    public List<AddressDTO> findAll() {
        List<AddressDTO> mappedAddresses = new ArrayList<>();
        addressRepo.findAll().forEach(address -> mappedAddresses.add(mapper.map(address, AddressDTO.class)));
        return mappedAddresses;
    }

    @Override
    public AddressDTO findOne(int id) {
        return mapper.map(addressRepo.findById(id), AddressDTO.class) ;
    }

    @Override
    public AddressDTO update(int id, AddressDTO address) {
        Address mappedAddress = mapper.map(address, Address.class);
        Address updatedAddress = addressRepo.save(mappedAddress);
        return mapper.map(updatedAddress, AddressDTO.class);
    }

    @Override
    public AddressDTO delete(int id) {

        Address address = addressRepo.findById(id).orElseThrow(() -> new RuntimeException("ID is not Valid"));
        addressRepo.delete(address);
        return mapper.map(address, AddressDTO.class);
    }
}
