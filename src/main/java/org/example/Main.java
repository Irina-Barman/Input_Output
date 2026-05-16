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
            byte[] array = new byte[8]; // Создадим массив на 1 тыс. байт
            int count = inputStream.read(array); // передаём массив, получает кол-во элементов которое было прочитано
            StringBuilder result = new StringBuilder();
            while (count > 0) { // читаем до тех пор, пока кол-во элементов > 0
                result.append(new String(array, 0,count)); // создаем строку из массива байт
                count = inputStream.read(array);
            }
            System.out.println(result.toString()); // преобразуем в строку

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
