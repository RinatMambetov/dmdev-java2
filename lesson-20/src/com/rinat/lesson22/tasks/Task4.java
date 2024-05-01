package com.rinat.lesson22.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        Path pathFrom = Path.of("src", "com", "rinat", "lesson22", "tasks", "Task1.java");
        String stringFrom = Files.readString(pathFrom);
        String stringTo = stringFrom.replace("public", "private");
        Path pathTo = Path.of("resources", "Task1.java");
        Files.writeString(pathTo, stringTo);
    }
}
