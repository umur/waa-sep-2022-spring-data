package lab3.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lab3.entity.Address;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String email;

    private String firstname;
    private String lastname;

    @JsonIgnore
    private String password;
    private Address address;
}
