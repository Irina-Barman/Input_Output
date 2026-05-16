package org.example;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory, "text.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
            int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = reader.read();
            }
            System.out.println(result.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
