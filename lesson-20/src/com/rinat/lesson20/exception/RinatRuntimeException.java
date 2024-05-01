package com.rinat.lesson20.exception;

public class RinatRuntimeException extends RuntimeException {
    public RinatRuntimeException(String message) {
        super(message);
    }

    public RinatRuntimeException(Throwable cause) {
        super(cause);
    }
}
