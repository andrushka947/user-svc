package com.master.degree.user_scv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "specialities")
@Data
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private int code;
    private String name;
    @Enumerated(EnumType.STRING)
    private Faculty faculty;

}
