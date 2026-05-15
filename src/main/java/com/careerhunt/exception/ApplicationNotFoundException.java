package com.careerhunt.exception;

public class ApplicationNotFoundException extends RuntimeException {

    private final Long id;

    public ApplicationNotFoundException(Long id) {
        super("Application with id: " + id + " not found");
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
