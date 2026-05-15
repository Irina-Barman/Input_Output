package org.example;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(InputStream inputStream = new FileInputStream(file)) { // создаём поток в конструкции try
            int a = inputStream.read(); // читаем и записываем значение байта
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read(); // читаем следующий символ
            }
        } catch (Exception e) { // будем ловить все исключения
            throw new RuntimeException(e);
        }
    }
}
