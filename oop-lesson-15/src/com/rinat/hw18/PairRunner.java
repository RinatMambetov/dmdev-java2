package com.rinat.hw18;

public class PairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("test", 42);
        System.out.println(pair1);
        
        Pair<Integer, String> pair2 = PairUtil.swap(pair1);
        System.out.println(pair2);
    }
}
