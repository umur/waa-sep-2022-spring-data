package com.example.springdata.DTO;

import com.example.springdata.Model.User;

import javax.persistence.OneToOne;

public class AddressDto {
    private int id;
    private String street;
    private int ZIP;
    private String city;


}