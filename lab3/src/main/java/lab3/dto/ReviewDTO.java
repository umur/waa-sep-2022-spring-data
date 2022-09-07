package lab3.dto;

import lombok.Data;

@Data
public class ReviewDTO {
    private int id;
    private String comment;
    private UserDTO user;
    private UserDTO product;
}
