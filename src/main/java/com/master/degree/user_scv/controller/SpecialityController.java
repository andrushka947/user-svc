package com.master.degree.user_scv.controller;

import com.master.degree.user_scv.entity.Speciality;
import com.master.degree.user_scv.service.SpecialityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/speciality")
@AllArgsConstructor
public class SpecialityController {

    private SpecialityService specialityService;

    @PostMapping
    public Speciality save(@RequestBody Speciality speciality) {
        return specialityService.save(speciality);
    }

}
