package com.waa.waalabthree.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany
    private List <Product>products;
}
