package lab3.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "review")
public class Review {

    @Id
    private int id;
    @Column(name = "comment")
    private String comment;


    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;
}
