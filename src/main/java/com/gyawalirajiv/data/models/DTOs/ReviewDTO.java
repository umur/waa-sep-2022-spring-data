package com.gyawalirajiv.data.models.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {

    private Long id;
    private String comment;
    private UserDTO user;

}
