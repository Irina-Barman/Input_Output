package org.example;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name or \"stop\" to exit");
            String next = scanner.nextLine();
            while (!next.equals("stop")) {
                outputStream.write(next.getBytes());
                outputStream.write("\n".getBytes());
                next = scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] array = new byte[128];
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0) {
                result.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

