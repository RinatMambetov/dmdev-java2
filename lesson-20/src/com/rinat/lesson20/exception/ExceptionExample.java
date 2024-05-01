package com.rinat.lesson20.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    private static void runtimeExceptionTest(int value) {
        System.out.println("start runtimeExceptionTest");
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("end runtimeExceptionTest");
    }

    public static void main(String[] args) {
        System.out.println("start main");
        try {
            System.out.println(finallyTest());
            runtimeExceptionTest(-1);
            unsafe(-1);
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("end main");
    }

    private static int finallyTest() {
        try {
            return 2;
        } catch (Throwable t) {
            return 3;
        } finally {
            return 4;
        }
    }

    private static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("start unsafe");
        if (value < 0) {
            throw new FileNotFoundException();
        }
        System.out.println("end unsafe");
    }
}
