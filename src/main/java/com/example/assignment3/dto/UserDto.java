package com.example.assignment3.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link com.example.assignment3.entity.User} entity
 */
@Data
public class UserDto implements Serializable {
    private final Long id;
    private final String email;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final List<ReviewDto> reviews;
    private final AddressDto address;

    /**
     * A DTO for the {@link com.example.assignment3.entity.Review} entity
     */
    @Data
    public static class ReviewDto implements Serializable {
        private final Long id;
        private final String comment;
    }

    /**
     * A DTO for the {@link com.example.assignment3.entity.Address} entity
     */
    @Data
    public static class AddressDto implements Serializable {
        private final Long id;
        private final String street;
        private final String city;
        private final int zip;
    }
}