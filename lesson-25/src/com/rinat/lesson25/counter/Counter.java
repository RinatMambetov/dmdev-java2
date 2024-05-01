package com.rinat.lesson25.counter;

public class Counter {
    private static String description;
    private int count;

    public static void init() {
        synchronized (Counter.class) {
            if (description == null) {
                description = "test static synchronized";
            }
        }
    }

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
