package lab3.service;

import lab3.entity.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Address save(Address address);

    public void update(Address address);
    public void delete(int id);
    public List<Address> findAll();
    Optional<Address> getById(int id);

}
