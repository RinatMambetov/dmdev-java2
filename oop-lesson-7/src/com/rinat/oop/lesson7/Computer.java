package com.rinat.oop.lesson7;

public class Computer {
    private static int counter = 0;
    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    void printState() {
        System.out.println("Computer: ram " + this.ram.getValue()
                + " ssd " + this.ssd.getValue());
    }
}
