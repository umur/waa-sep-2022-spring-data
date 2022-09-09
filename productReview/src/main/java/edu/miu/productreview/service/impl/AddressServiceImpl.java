package edu.miu.productreview.service.impl;

import edu.miu.productreview.domain.Address;
import edu.miu.productreview.dto.AddressDto;
import edu.miu.productreview.mapper.AddressMapper;
import edu.miu.productreview.repo.AddressRepo;
import edu.miu.productreview.service.AddressService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;

    private final AddressMapper addressMapper;
    //private final ModelMapper mapper;
    @Override
    public AddressDto save(AddressDto address) {
        Address result = addressRepo.save(addressMapper.toEntity(address));
        return addressMapper.toDto(result);
    }

    @Override
    public List<AddressDto> findAll() {
        List<Address> addresses = new ArrayList<>();
        addressRepo.findAll().forEach(addresses::add);
        return addressMapper.toDtos(addresses);
        //return addresses.stream().map(addr -> mapper.map(addr, AddressDto.class)).toList();
    }

    @Override
    public AddressDto findById(int id) {
        return addressRepo.findById(id)
                .map(addressMapper::toDto)
                .orElse(new AddressDto());
    }

    @Override
    public AddressDto update(int id, AddressDto addressDto) {
        if(addressRepo.existsById(id)) {
            addressDto.setId(id);
            return this.save(addressDto);
        } else {
            throw new NoResultException();
        }
    }

    @Override
    public void delete(int id) {
        if(addressRepo.existsById(id)) {
            addressRepo.deleteById(id);
        } else {
            throw new NoResultException();
        }
    }
}
