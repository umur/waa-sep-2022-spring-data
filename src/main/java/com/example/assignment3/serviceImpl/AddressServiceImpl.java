package com.example.assignment3.serviceImpl;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.entity.Address;
import com.example.assignment3.expection.ResourceNotFoundException;
import com.example.assignment3.mapper.AddressMapper;
import com.example.assignment3.repository.AddressRepository;
import com.example.assignment3.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository repository;
    private final AddressMapper addressMapper;

    public AddressDto save(AddressDto addressDto) {
        Address entity = addressMapper.toEntity(addressDto);
        return addressMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public AddressDto findById(Long id) {
        return addressMapper.toDto(findByIdRow(id));
    }

    public Page<AddressDto> findByCondition(AddressDto addressDto, Pageable pageable) {
        Page<Address> entityPage = repository.findAll(Example.of(addressMapper.toEntity(addressDto)), pageable);
        List<Address> entities = entityPage.getContent();
        return new PageImpl<>(addressMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public AddressDto update(AddressDto addressDto, Long id) {
        Address data = findByIdRow(id);
        System.out.println(data.getCreateAt());
        addressMapper.updateEntityFromDto(addressDto, data);
        System.out.println(data.getCreateAt());
        return addressMapper.toDto(repository.save(data));
    }

    private Address findByIdRow(Long id){
        return repository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
