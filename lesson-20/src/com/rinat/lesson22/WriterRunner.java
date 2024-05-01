package com.rinat.lesson22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
//        File file = Path.of("resources", "writer.poem").toFile();
        Path path = Path.of("resources", "writer.poem");

//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
//        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
//            fileWriter.append("Hello World");
//            fileWriter.newLine();
//            fileWriter.append("Java");
//        }
        Files.write(path, List.of("Hello Java", "World"));
    }
}
