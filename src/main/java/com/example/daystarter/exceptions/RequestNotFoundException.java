package com.example.daystarter.exceptions;

public class RequestNotFoundException extends RuntimeException {
    public RequestNotFoundException(String categoryNotAvailable) {
        super(categoryNotAvailable);
    }
}
