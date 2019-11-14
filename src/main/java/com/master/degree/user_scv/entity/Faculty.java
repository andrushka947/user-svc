package com.master.degree.user_scv.entity;

import com.master.degree.user_scv.exception.BadRequestException;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum Faculty {

    FMTP("ФМТП"),
    FTM("ФТМ"),
    FEMP("ФЕМП"),
    FRGTB("ФРГТБ"),
    FOAIS("ФОАІС"),
    FFBS("ФФБС");

    private String name;

    public static Faculty getByName(String facultyName) {
        return Arrays.stream(values())
                .filter(f -> f.name.equals(facultyName))
                .findFirst().orElseThrow(() -> new BadRequestException("No such Faculty "));

    }

}
