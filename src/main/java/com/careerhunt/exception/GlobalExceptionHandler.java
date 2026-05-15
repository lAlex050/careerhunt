package com.careerhunt.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApplicationNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(ApplicationNotFoundException ex, HttpServletRequest request) {

        ErrorCode code = ErrorCode.APPLICATION_NOT_FOUND;
        HttpStatus status = code.getDefaultStatus();

    ErrorResponse body = new ErrorResponse(
            status.value(),
            code,
            ex.getMessage(),
            Instant.now(),
            request.getRequestURI()
    );

        return ResponseEntity.status(status).body(body);
    };


}
