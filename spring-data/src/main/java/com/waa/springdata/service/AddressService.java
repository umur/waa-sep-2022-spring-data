package com.waa.springdata.service;

import com.waa.springdata.entity.Address;

import java.util.List;

public interface AddressService {
    void save(Address address);
    List<Address> findAll();
}
