package com.waa.springdata.service.impl;

import com.waa.springdata.entity.Address;
import com.waa.springdata.repo.AddressRepo;
import com.waa.springdata.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }
}
