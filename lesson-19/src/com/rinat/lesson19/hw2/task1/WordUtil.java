package com.rinat.lesson19.hw2.task1;

import java.util.HashMap;
import java.util.Map;

public final class WordUtil {
    private final static String EMPTY = "";
    private final static String SPACE = " ";

    private WordUtil() {
    }

    public static Map<String, Integer> getWords(String text) {
        text = text.replace(".", EMPTY).replace(",", EMPTY);
        String[] words = text.split(SPACE);

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer oldCount = map.get(word);
            int newCount = oldCount == null ? 1 : oldCount + 1;
            map.put(word, newCount);
        }
        return map;
    }
}
