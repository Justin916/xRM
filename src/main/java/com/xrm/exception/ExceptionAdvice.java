package com.xrm.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(LoginFailedException.class)
    public ResponseEntity handleLoginException(LoginFailedException ex, WebRequest request) {
        return new ResponseEntity<>(ex, HttpStatus.NOT_ACCEPTABLE);
    }
}
