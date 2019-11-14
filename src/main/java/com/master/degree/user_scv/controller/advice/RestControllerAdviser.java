package com.master.degree.user_scv.controller.advice;

import com.master.degree.user_scv.dto.ErrorResponse;
import com.master.degree.user_scv.exception.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestControllerAdviser {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleRuntimeException(BadRequestException ex) {
        return new ErrorResponse(ex.getMessage());
    }

}
