package edu.miu.lab_3.service.imp;

import edu.miu.lab_3.dto.AddressDto;
import edu.miu.lab_3.entity.Address;
import edu.miu.lab_3.repo.AddressRepo;
import edu.miu.lab_3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class AddressServiceImp implements AddressService {

    @Autowired
    private final AddressRepo addressRepo;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<AddressDto> findAll() {
        return mapAddressToAddressDtos(addressRepo.findAll());
    }
    private List<AddressDto> mapAddressToAddressDtos(Iterable<Address> addressIterable) {
        System.out.println("MAPPING ADDRESS TO DTO");
        List<AddressDto> dtoList = new ArrayList<>();

        for (Address address : addressIterable) {
            dtoList.add(modelMapper.map(address, AddressDto.class));
        }

        return dtoList;
    }
    @Override
    public AddressDto findAddressById(int id) {
        return mapAddressToAddressDto(addressRepo.findById(id).get());
    }
    private AddressDto mapAddressToAddressDto(Address address) {
        return modelMapper.map(address, AddressDto.class);
    }
    @Override
    public void deleteAddressById(int id) {
         addressRepo.deleteById(id);
    }

    @Override
    public void save(Address address) {
         addressRepo.save(address);
    }
    private Address mapAddressDtoToAddress(AddressDto addressDto) {
        return modelMapper.map(addressDto, Address.class);
    }

    @Override
    public AddressDto updateAddress(int id, AddressDto addressDto) {
        AddressDto addressDto1 = findAddressById(id);
        deleteAddressById(id);
        save(mapAddressDtoToAddress(addressDto));
        return addressDto;
    }
}
