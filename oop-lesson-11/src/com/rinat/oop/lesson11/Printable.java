package com.rinat.oop.lesson11;

import java.util.Random;

public interface Printable {
    String SOME_VALUE = "Example";
    Random random = new Random();

    default void printWithRandom() {
        System.out.println(getRandom());
        print();
    }

    private int getRandom() {
        return random.nextInt();
    }

    void print();
}
