package com.miu.day3Jpa.dto;

import lombok.*;

import javax.persistence.OneToOne;


//@Setter
//@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

       private String street;
       private String zip;
       private String city;

}
