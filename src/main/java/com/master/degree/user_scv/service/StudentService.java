package com.master.degree.user_scv.service;

import com.master.degree.user_scv.dto.StudentSaveDto;
import com.master.degree.user_scv.entity.Faculty;
import com.master.degree.user_scv.entity.Speciality;
import com.master.degree.user_scv.entity.Student;
import com.master.degree.user_scv.exception.BadRequestException;
import com.master.degree.user_scv.mapper.StudentMapper;
import com.master.degree.user_scv.repository.SpecialityRepository;
import com.master.degree.user_scv.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;
    private SpecialityRepository specialityRepository;

    public List<Student> getAllBySpecialityAndYearOfStudy(Speciality speciality, int yearOfStudy) {
        return studentRepository.findAllBySpecialityAndEntranceYear(speciality, yearOfStudy);
    }

    public List<Student> getAllByFaculty(Faculty faculty) {
        return studentRepository.findAllByFaculty(faculty);
    }

    public Student save(StudentSaveDto studentDto) {
        Speciality speciality = specialityRepository.findByName(studentDto.getSpeciality());
        if (speciality == null) {
            throw new BadRequestException("No such speciality");
        }
        Student student = studentMapper.toStudent(studentDto);
        student.setSpeciality(speciality);
        return studentRepository.save(student);
    }
}
