package org.example;


import java.io.*;

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
        try (InputStream inputStream = new FileInputStream(file)) {
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder(); // StringBuilder метод для добавления строковых символов
            while (a != -1) {
                result.append((char) a); // добавляем символ
                a = inputStream.read(); // читаем следующий
            }
            System.out.println(result.toString()); // преобразуем в строку
            long after = System.currentTimeMillis();
            System.out.println("Time - " + (after - before));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
