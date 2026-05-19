package org.example;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (OutputStream outputStream = new FileOutputStream(file, true)){
            String names = "John Max Nick Thomas Andrew Roman Herbert Alex";
            outputStream.write(names.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

