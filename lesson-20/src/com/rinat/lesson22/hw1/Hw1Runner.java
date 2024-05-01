package com.rinat.lesson22.hw1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class Hw1Runner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "poem.txt");
        Map<Character, Integer> characterIntegerMap = CharacterHelper.calcFrequency(path);

        Path pathOut = Path.of("resources", "hw1result");
        Files.write(pathOut, CharacterHelper.toListRepresentation(characterIntegerMap), CREATE, TRUNCATE_EXISTING);

    }
}
