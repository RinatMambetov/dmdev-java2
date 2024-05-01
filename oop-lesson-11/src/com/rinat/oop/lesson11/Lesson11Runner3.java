package com.rinat.oop.lesson11;

public class Lesson11Runner3 {
    public static void main(String[] args) {
        Ram ram1 = new Ram(512);
        Ssd ssd1 = new Ssd(1024);
        Ram ram2 = new Ram(256);
        Ssd ssd2 = new Ssd(512);

        Computer laptop1 = new Laptop(ram1, ssd1, 2);
        Computer mobile1 = new Mobile(ram2, ssd2);

//        laptop1.load();
//        mobile1.load();
        System.out.println();
        loadComputers(laptop1, mobile1);
        System.out.println();
        printInfo(new Computer[]{laptop1, mobile1});
    }

    private static void printInfo(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
        }
    }

    private static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            if (computer instanceof Laptop) {
                ((Laptop) computer).open();
            }
            computer.load();
        }
    }
}
