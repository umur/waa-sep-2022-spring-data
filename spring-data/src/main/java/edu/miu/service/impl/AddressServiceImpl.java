package edu.miu.service.impl;

import edu.miu.entity.Address;
import edu.miu.repo.AddressRepo;
import edu.miu.service.AddressService;
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
