package com.enigmacamp.lambda.exception;

public class ValidationException extends RuntimeException{
    ValidationException(String msg){
        super(msg);
    }
}
