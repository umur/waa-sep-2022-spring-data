package edu.miu.springdatademo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "category", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Product> products;
}
