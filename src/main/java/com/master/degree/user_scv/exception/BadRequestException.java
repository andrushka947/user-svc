package com.master.degree.user_scv.exception;

import lombok.Data;

@Data
public class BadRequestException extends RuntimeException {

    private String message;

    public BadRequestException(String message) {
        super();
        this.message = message;
    }

}
