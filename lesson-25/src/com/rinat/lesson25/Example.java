package com.rinat.lesson25;

import java.util.ArrayList;
import java.util.List;

public class Example {
    List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
//        return list;
        return new ArrayList<>(list);
    }
}
