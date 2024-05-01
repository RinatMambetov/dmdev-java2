package com.rinat.lesson22.tasks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * 5. Задан файл с java-кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */
public class Task5 {
    public static void main(String[] args) {
        Path pathFrom = Path.of("src", "com", "rinat", "lesson22", "tasks", "Task1.java");
        Path pathTo = Path.of("resources", "Task1reversed");

        try (Stream<String> lines = Files.lines(pathFrom);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(pathTo, APPEND, CREATE)) {
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
