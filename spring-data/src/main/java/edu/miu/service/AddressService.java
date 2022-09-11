package edu.miu.service;

import edu.miu.entity.Address;

import java.util.List;

public interface AddressService {
    void save(Address address);
    List<Address> findAll();
}
