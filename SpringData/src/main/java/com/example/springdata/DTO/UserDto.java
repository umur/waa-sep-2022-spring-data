package com.example.springdata.DTO;

import com.example.springdata.Model.Address;
import com.example.springdata.Model.Review;

import javax.persistence.*;
import java.util.List;

public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
