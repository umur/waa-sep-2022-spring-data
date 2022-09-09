package com.example.assignment3.service;

import com.example.assignment3.dto.AddressDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface AddressService {

    AddressDto save(AddressDto addressDto);

    void deleteById(Long id);

    AddressDto findById(Long id);

    Page<AddressDto> findByCondition(AddressDto addressDto, Pageable pageable);

    AddressDto update(AddressDto addressDto, Long id);

}