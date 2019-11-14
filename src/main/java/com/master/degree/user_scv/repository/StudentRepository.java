package com.master.degree.user_scv.repository;

import com.master.degree.user_scv.entity.Faculty;
import com.master.degree.user_scv.entity.Speciality;
import com.master.degree.user_scv.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllBySpecialityAndEntranceYear(Speciality speciality, int entranceYear);

    List<Student> findAllByFaculty(Faculty faculty);
}
