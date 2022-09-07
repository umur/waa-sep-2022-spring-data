package edu.miu.springdataday3.repo;

import edu.miu.springdataday3.entitiy.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Integer> {
}
