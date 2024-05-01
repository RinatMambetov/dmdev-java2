package com.rinat.oop.lesson2;

public class Computer {
    private int ssd = 500;
    private int ram = 1024;

    public Computer() {
        System.out.println("I'm alive!");
    }

    protected Computer(int ssd) {
        this.ssd = ssd;
    }

    Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("I'm loading...");
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
}
