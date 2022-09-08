package com.miu.day3Jpa.service.impl;

import com.miu.day3Jpa.dto.AddressDTO;
import com.miu.day3Jpa.entity.Address;
import com.miu.day3Jpa.repository.AddressRepository;
import com.miu.day3Jpa.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<AddressDTO> getAllAddress(){
        List<Address> addresses = (List<Address>) addressRepository.findAll();
        return addresses.stream().map(address -> modelMapper.map(address,AddressDTO.class)).collect(Collectors.toList());
    }

    public void saveAddress(AddressDTO addressDTO){
        Address address = modelMapper.map(addressDTO,Address.class);
        addressRepository.save(address);
    }
    @Transactional
    public void updateAddress(AddressDTO addressDTO,int id){
        System.out.println(addressDTO.getStreet());
        Address addressToBeUpdated = addressRepository.findById(id).get();
        addressToBeUpdated.setCity(addressDTO.getCity());
        addressToBeUpdated.setStreet(addressToBeUpdated.getStreet());
        addressToBeUpdated.setZip(addressToBeUpdated.getZip());
        addressRepository.save(addressToBeUpdated);
    }

    public void deleteAddress(int id){
        addressRepository.deleteById(id);
    }



}
