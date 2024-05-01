package com.rinat.oop.lesson11;

//public class Mobile extends Laptop{
//}
public class Mobile extends Computer {
    static {
        System.out.println("static block mobile");
    }

    {
        System.out.println("init block mobile");
    }

    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("mobile loading...");
    }
}
