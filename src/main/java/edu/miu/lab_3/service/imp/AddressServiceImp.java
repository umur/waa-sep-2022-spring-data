package edu.miu.lab_3.service.imp;

import edu.miu.lab_3.dto.AddressDto;
import edu.miu.lab_3.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImp implements AddressService {
    @Override
    public List<AddressDto> findAll() {
        return null;
    }

    @Override
    public AddressDto findAddressById(int id) {
        return null;
    }

    @Override
    public AddressDto deleteAddressById(int id) {
        return null;
    }

    @Override
    public AddressDto save(AddressDto addressDto) {
        return null;
    }

    @Override
    public AddressDto updateAddress(int id, AddressDto addressDto) {
        return null;
    }
}
