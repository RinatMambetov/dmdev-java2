package com.rinat.lesson25;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
//        Thread.currentThread().setName("MyRunnableThread");
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
