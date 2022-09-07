package lab3.service.impl;

import lab3.entity.Address;
import lab3.repo.AddressRepo;
import lab3.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    private AddressRepo addressRepo;


    @Override
    public Address save(Address address) {
        return addressRepo.save(address);
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(int id) {
addressRepo.deleteById(id);
    }

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    @Override
    public Optional<Address> getById(int id) {
        return  addressRepo.findById(id);
    }
}
