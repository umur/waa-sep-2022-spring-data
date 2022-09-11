package com.waa.waalabthree.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Review {
    @Id
    @GeneratedValue
    private int id;
    private String comment;

    @ManyToOne
    private User user;
}
