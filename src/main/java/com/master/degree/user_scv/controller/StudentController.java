package com.master.degree.user_scv.controller;

import com.master.degree.user_scv.dto.StudentSaveDto;
import com.master.degree.user_scv.entity.Faculty;
import com.master.degree.user_scv.entity.Speciality;
import com.master.degree.user_scv.entity.Student;
import com.master.degree.user_scv.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/students")
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @GetMapping
    public List<Student> getBySpecialityAndYearOfStudy(@RequestParam("speciality") Speciality speciality,
                                                       @RequestParam("yearOfStudy") int yearOfStudy) {
        return studentService.getAllBySpecialityAndYearOfStudy(speciality, yearOfStudy);
    }

    @GetMapping(path = "/faculty/{faculty}")
    public List<Student> getByFaculty(@PathVariable("faculty") Faculty faculty) {
        return studentService.getAllByFaculty(faculty);
    }

    @PostMapping
    public Student save(@RequestBody StudentSaveDto studentDto) {
        return studentService.save(studentDto);
    }

}
