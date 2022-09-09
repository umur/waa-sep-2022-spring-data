package com.example.assignment3.dto;

import io.swagger.annotations.ApiModel;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link com.example.assignment3.entity.User} entity
 */
@Value
@ApiModel()
public class UserDto implements Serializable {
    Long id;
    String email;
    String password;
    String firstname;
    String lastname;
    List<ReviewDto> reviews;
    AddressDto address;

    /**
     * A DTO for the {@link com.example.assignment3.entity.Review} entity
     */
    @Value
    public static class ReviewDto implements Serializable {
        Long id;
        String comment;
    }

    /**
     * A DTO for the {@link com.example.assignment3.entity.Address} entity
     */
    @Value
    public static class AddressDto implements Serializable {
        Long id;
        String street;
        String city;
        int zip;
    }
}