package com.rinat.oop.lesson9;

import com.rinat.oop.lesson7.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer1 = new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        System.out.println(Computer.getCounter());
        Class<? extends Computer> clazz1 = computer1.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();
        System.out.println(clazz1 == clazz2);
        System.out.println(computer1 == computer2);
    }
}
