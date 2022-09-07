package lab3.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private int id;

    private String street;

    private String zip;

    private String city;
}
