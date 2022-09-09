package com.example.assignment3.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.assignment3.entity.Review} entity
 */
@Data
@ApiModel
public class ReviewDto implements Serializable {
    private Long id;
    private String comment;
    private LocalDate createAt;
    private LocalDate updateAt;
    private UserDto1 user;

    /**
     * A DTO for the {@link com.example.assignment3.entity.User} entity
     */
    @Data
    public static class UserDto1 implements Serializable {
        private Long id;
        private String email;
        private String password;
        private String firstname;
        private String lastname;
        private LocalDate createAt;
        private LocalDate updateAt;
        private AddressDto1 address;

        /**
         * A DTO for the {@link com.example.assignment3.entity.Address} entity
         */
        @Data
        public static class AddressDto1 implements Serializable {
            private Long id;
            private String street;
            private String city;
            private int zip;
            private LocalDate createAt;
            private LocalDate updateAt;
        }
    }
}