package com.rinat.oop.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer0 = new Computer();
        computer0.load();
        computer0.printState();
        Computer computer1 = new Computer(600);
        Computer computer2 = new Computer(700, 1200);
        computer1.printState();
        computer2.printState();
    }
}
