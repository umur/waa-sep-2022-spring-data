package com.example.springdata.DTO;

import com.example.springdata.Model.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ReviewDto {
    private int id;
    private String comment;

}
