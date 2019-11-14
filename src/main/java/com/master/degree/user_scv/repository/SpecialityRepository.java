package com.master.degree.user_scv.repository;

import com.master.degree.user_scv.entity.Speciality;
import com.master.degree.user_scv.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Long> {

    Speciality findByName(String name);

}
