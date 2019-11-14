package com.master.degree.user_scv.dto;

import com.master.degree.user_scv.entity.Faculty;
import lombok.Data;


@Data
public class StudentSaveDto {

    private String name;
    private String surname;
    private String fatherName;

    private int entranceYear;

    private String speciality;
    private Faculty faculty;
    private String group;

}
