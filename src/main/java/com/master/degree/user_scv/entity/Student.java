package com.master.degree.user_scv.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String fatherName;

    private int entranceYear;

    @ManyToOne
    @JoinColumn(name = "speciality_id")
    private Speciality speciality;
    @Enumerated(EnumType.STRING)
    private Faculty faculty;
    @Column(name = "groupId")
    private String group;

}
