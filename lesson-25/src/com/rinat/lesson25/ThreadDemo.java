package com.rinat.lesson25;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());
        simpleThread.start();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());
        simpleThread.join();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());

        System.out.println(Thread.currentThread().getName());

        var simpleRunnable = new Thread(new SimpleRunnable(), "MyRunnableThread");
        simpleRunnable.start();
        simpleThread.join();

        var lambdaThread = new Thread(() -> System.out.println("Hello from " + Thread.currentThread().getName()));
        lambdaThread.start();
        lambdaThread.join();
    }
}
