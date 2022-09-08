package com.miu.day3Jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserDTO {

    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
