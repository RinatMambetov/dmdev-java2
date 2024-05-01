package com.rinat.lesson22.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * 3. Задан файл с текстом. В каждой строке найти и вывести
 * наибольшее число цифр, идущих подряд.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "poem.txt");

        List<String> strings = Files.readAllLines(path);
        strings.stream()
                .map(Task3::getMaxNums)
                .forEach(System.out::println);
    }

    private static int getMaxNums(String s) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count != 0 && count > max) {
            max = count;
        }
        return max;
    }
}
