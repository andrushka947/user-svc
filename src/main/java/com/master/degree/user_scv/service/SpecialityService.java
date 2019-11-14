package com.master.degree.user_scv.service;

import com.master.degree.user_scv.entity.Speciality;
import com.master.degree.user_scv.repository.SpecialityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpecialityService {

    private SpecialityRepository specialityRepository;

    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

}
