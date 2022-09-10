package edu.miu.springdataday3.dto;

import edu.miu.springdataday3.entitiy.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private Address address;
}
