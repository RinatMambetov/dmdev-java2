package com.rinat.lesson22.tasks;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class Task1 {
    public static String VOWELS = "уеыаоэяию";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "poem.txt");

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String next = scanner.next();
                String firstSymbol = next.substring(0, 1);
                if (VOWELS.contains(firstSymbol)) {
                    System.out.println(next);
                }
            }
        }
    }
}
