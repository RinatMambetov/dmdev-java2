package com.rinat.oop.lesson11;

public abstract class Computer implements Printable {
    static {
        System.out.println("static block computer");
    }

    private Ram ram;
    private Ssd ssd;

    {
        System.out.println("init block computer");
    }

    public Computer() {
        System.out.println("computer constructor");
    }

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void print() {
        System.out.println("Ssd: " + ssd.getValue() + ", Ram: " + ram.getValue());
        System.out.println(SOME_VALUE);
    }

    public abstract void load();

//    public abstract void load() {
//        System.out.println("I'm loading...");
//    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }
}
