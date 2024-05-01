package com.rinat.lesson22.hw2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public final class DigitHelper {
    private DigitHelper() {
    }

    public static List<String> readSorted(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            return lines
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(toList());
        }
    }
}
