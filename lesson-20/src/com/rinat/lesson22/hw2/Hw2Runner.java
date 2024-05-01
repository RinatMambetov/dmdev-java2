package com.rinat.lesson22.hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hw2Runner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "hw2result");
//        Files.write(path, RandomUtil.generateDigits(100), CREATE, TRUNCATE_EXISTING);
        Files.write(path, RandomUtil.generateDigits(100));
        Files.write(path, DigitHelper.readSorted(path));
    }
}
