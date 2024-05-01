package com.rinat.oop.lesson11;

public class Lesson11Runner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(526);
//        Computer computer = new Computer(ram, ssd);
//        computer.load();

        Laptop laptop1 = new Laptop(new Ram(526), ssd, 2);
//        laptop1.open();
        laptop1.load();

    }
}
