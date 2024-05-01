package com.rinat.lesson19.tasks;

import java.util.HashSet;
import java.util.Map;

/**
 * 3. Написать метод isUnique, который принимает Map<String, String>
 * и возвращает true,
 * если каждому ключу соответствуют свое уникальное значение.
 * Например, в данном случае вернётся true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal=Perkins}
 * А в данном false:
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
 * Hal=Perkins}
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
//                "Halq", "Perkins"
        );

        System.out.println(isUnique(map));
    }

    private static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }
}
