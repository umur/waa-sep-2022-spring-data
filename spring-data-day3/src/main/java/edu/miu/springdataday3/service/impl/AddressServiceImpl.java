package edu.miu.springdataday3.service.impl;

import edu.miu.springdataday3.entitiy.Address;
import edu.miu.springdataday3.repo.AddressRepo;
import edu.miu.springdataday3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepo addressRepo;
    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address findByID(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void deleteById(int id) {
        addressRepo.deleteById(id);
    }
}
