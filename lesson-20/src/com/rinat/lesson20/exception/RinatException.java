package com.rinat.lesson20.exception;

public class RinatException extends Exception {
    public RinatException(String message) {
        super(message);
    }

    public RinatException(Throwable cause) {
        super(cause);
    }
}
