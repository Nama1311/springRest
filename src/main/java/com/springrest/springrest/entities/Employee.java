package com.springrest.springrest.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@RequiredArgsConstructor
@Data
@Table(schema = "employee")
public class Employee {

    @Id
    private Integer id;
    private String department;
    private String title;

}
