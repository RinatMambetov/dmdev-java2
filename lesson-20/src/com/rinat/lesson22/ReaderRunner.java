package com.rinat.lesson22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
//        File file = Path.of("resources", "poem.txt").toFile();
        Path path = Path.of("resources", "poem.txt");

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//            String string = bufferedReader.lines()
//                    .collect(Collectors.joining("\n"));
//            System.out.println(string);
//        }
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }
    }
}
