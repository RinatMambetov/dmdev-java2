package com.rinat.oop.lesson11;

public final class Laptop extends Computer {
    static {
        System.out.println("static block laptop");
    }

    private int weight;

    {
        System.out.println("init block laptop");
    }

    public Laptop() {
        System.out.println("laptop constructor");
    }

    public Laptop(Ram ram, Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }

    @Override
    public void load() {
//        open();
        System.out.println("laptop loading...");
    }

    public void open() {
        System.out.println("laptop opening...");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight: " + weight);
    }

    public int getWeight() {
        return weight;
    }
}
