package com.rinat.lesson19.tasks;

import java.util.*;

/**
 * 4. Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
 * cx^3 + dx + 8
 */
public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(
                0, 3,
                1, 2,
                3, 2,
                4, 5,
                6, 2
        );
        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                4, 3,
                6, 5
        );
//        7x^6+8x^4+6x^3+2x^1+8

        Map<Integer, Integer> sum = getSum(polynomial1, polynomial2);

        System.out.println(convertToString(sum));
    }

    private static String convertToString(Map<Integer, Integer> map) {
        Map<Integer, Integer> newMap = new TreeMap<>(Comparator.reverseOrder());
        newMap.putAll(map);
        List<String> members = new ArrayList<>(map.size());
        for (Map.Entry<Integer, Integer> entry : newMap.entrySet()) {
            String member =
                    entry.getKey() == 0 ?
                            String.valueOf(entry.getValue()) :
                            entry.getValue() +
                                    "x^" + entry.getKey();
            members.add(member);
        }
        return String.join(" + ", members);
    }

    private static Map<Integer, Integer> getSum(Map<Integer, Integer> polynomial1,
                                                Map<Integer, Integer> polynomial2) {
        Map<Integer, Integer> result = new HashMap<>(polynomial1);
        for (Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
//            result.put(entry.getKey(), entry.getValue() + result.get(entry.getKey()));
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return result;
    }
}
