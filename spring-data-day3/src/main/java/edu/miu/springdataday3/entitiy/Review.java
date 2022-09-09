package edu.miu.springdataday3.entitiy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String comment;
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    User user;

}
