package edu.miu.springdataday3.entitiy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Person {
    @Id
    int id;
    String name;
    String gender;
}
