package henry.waasep2022springdata.service;

import henry.waasep2022springdata.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    void save(AddressDto addressDto);
    List<AddressDto> findAll();
    void update(int addressId, AddressDto addressDto);
    AddressDto delete(int addressId);
}
