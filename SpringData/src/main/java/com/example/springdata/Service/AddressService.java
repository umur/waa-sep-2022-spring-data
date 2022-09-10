package com.example.springdata.Service;


import com.example.springdata.Model.Address;

import java.util.List;

public interface AddressService {
    public List<Address> findAllAddress();
    public Address findAddressByID();
    public void addAddress();
    public void updateAddress();
    public void deleteAddress();

}
