package com.ak.springbootgraphql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private String phoneNo;
    private String email;
    private String[] subject;
}
