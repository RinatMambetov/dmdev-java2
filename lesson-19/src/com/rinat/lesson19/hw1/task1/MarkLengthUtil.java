package com.rinat.lesson19.hw1.task1;

import java.util.List;
import java.util.ListIterator;

public final class MarkLengthUtil {
    private static final int TARGET_LENGTH = 4;
    private static final String TARGET_VALUE = "****";

    private MarkLengthUtil() {
    }

    public static void markLength4(List<String> list) {

        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            String next = stringListIterator.next();
            if (next.length() == TARGET_LENGTH) {
                stringListIterator.set(TARGET_VALUE);
                stringListIterator.add(next);
            }
        }

    }
}
