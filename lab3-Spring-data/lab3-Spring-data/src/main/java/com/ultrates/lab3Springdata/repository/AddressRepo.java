package com.ultrates.lab3Springdata.repository;

import com.ultrates.lab3Springdata.entity.bidirectional.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {

}
