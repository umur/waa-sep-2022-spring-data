package edu.miu.lab3springdata.dto;

import lombok.Data;

@Data
public class AddressDto {

    private Integer id;

    private String street;

    private String zip;

    private String city;

}
