package com.rinat.lesson23;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = Path.of("resources", "student.out").toFile();

        writeObject(file);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }
    }

    private static void writeObject(File file) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            Person ivan = new Person(20, "Ivan");
            objectOutputStream.writeObject(ivan);

        }
    }
}
