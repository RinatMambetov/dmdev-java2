package com.rinat.lesson25;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        setName("MySimpleThread");
        System.out.println("Hello from " + getName());
    }
}
