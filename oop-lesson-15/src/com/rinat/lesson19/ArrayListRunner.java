package com.rinat.lesson19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> integers1 = new ArrayList<>(3);
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        System.out.println(integers1);

        List<Integer> integers2 = new LinkedList<>();
        integers2.add(1);
        integers2.add(2);
        integers2.add(3);
        integers2.add(4);
        System.out.println(integers2);
    }
}
