package com.ultrates.lab3Springdata.dto;

import com.ultrates.lab3Springdata.entity.unidirectional.AddressUni;
import com.ultrates.lab3Springdata.entity.unidirectional.ReviewUni;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<ReviewUni> reviewUnis;
    private AddressUni addressUni;
}
