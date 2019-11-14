package com.master.degree.user_scv.mapper;

import com.master.degree.user_scv.dto.StudentSaveDto;
import com.master.degree.user_scv.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {

    @Mapping(target = "speciality", ignore = true)
    Student toStudent(StudentSaveDto dto);


}
