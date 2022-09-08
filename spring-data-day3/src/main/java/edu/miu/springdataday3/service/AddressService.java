package edu.miu.springdataday3.service;

import edu.miu.springdataday3.entitiy.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
    Address findByID(int id);
    void save(Address address);
    void deleteById(int id);
}
