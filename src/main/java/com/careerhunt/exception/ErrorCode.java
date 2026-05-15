package com.careerhunt.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    APPLICATION_NOT_FOUND(HttpStatus.NOT_FOUND);

    private final HttpStatus defaultStatus;

    ErrorCode(HttpStatus defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public HttpStatus getDefaultStatus() {
        return defaultStatus;
    }
}
