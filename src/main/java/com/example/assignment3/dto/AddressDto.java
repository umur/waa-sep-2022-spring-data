package com.example.assignment3.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * A DTO for the {@link com.example.assignment3.entity.Address} entity
 */
@Data
@ApiModel()
public class AddressDto implements Serializable {
    private Long id;
    private String street;
    private String city;
    private int zip;
    private UserDto user;

    /**
     * A DTO for the {@link com.example.assignment3.entity.User} entity
     */
    @Data
    public static class UserDto implements Serializable {
        private Long id;
        private String email;
        private String password;
        private String firstname;
        private String lastname;
        private List<ReviewDto> reviews;

        /**
         * A DTO for the {@link com.example.assignment3.entity.Review} entity
         */
        @Data
        public static class ReviewDto implements Serializable {
            private Long id;
            private String comment;
        }
    }
}