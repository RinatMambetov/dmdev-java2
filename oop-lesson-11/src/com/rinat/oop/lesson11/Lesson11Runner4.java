package com.rinat.oop.lesson11;

public class Lesson11Runner4 {
    public static void main(String[] args) {
        Ram ram1 = new Ram(512);
        Ssd ssd1 = new Ssd(1024);
        Ram ram2 = new Ram(256);
        Ssd ssd2 = new Ssd(512);

        Printable laptop1 = new Laptop(ram1, ssd1, 2);
        Printable mobile1 = new Mobile(ram2, ssd2);

        print(laptop1, mobile1);
        printWithRandom(laptop1, mobile1);
    }

    private static void print(Printable... objects) {
        for (Printable obj : objects) {
            obj.print();
            System.out.println();
        }
    }

    private static void printWithRandom(Printable... objects) {
        for (Printable obj : objects) {
            obj.printWithRandom();
            System.out.println();
        }
    }
}
