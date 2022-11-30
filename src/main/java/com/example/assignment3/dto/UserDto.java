package com.example.assignment3.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link com.example.assignment3.entity.User} entity
 */
@Data
@ApiModel()
public class UserDto implements Serializable {
    private Long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private List<ReviewDto> reviews;
    private AddressDto address;

    /**
     * A DTO for the {@link com.example.assignment3.entity.Review} entity
     */
    @Data
    public static class ReviewDto implements Serializable {
        private Long id;
        private String comment;
    }

    /**
     * A DTO for the {@link com.example.assignment3.entity.Address} entity
     */
    @Data
    public static class AddressDto implements Serializable {
        private Long id;
        private String street;
        private String city;
        private int zip;
    }
}