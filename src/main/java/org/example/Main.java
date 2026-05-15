package org.example;


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder2"); // задаёт имя папки
        File directoryes = new File("dir/folder/folder1"); // задаёт имена иерархии папок
        File file = new File("dir/folder/folder1/file1.txt"); // описывает путь к файлу и назначает имя
        File file2 = new File("dir/folder/folder1/file2.txt");
        File file5 = new File("folder2/file5.txt");
        File file4 = new File("folder2/file4.txt");



        try {
            directoryes.mkdirs(); // создаёт иерархию папок
            directory.mkdir(); // создаёт новую папку
            file.createNewFile(); // создаёт новый файл
            file2.createNewFile();
            file5.createNewFile();
            file4.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] fold2 = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains("4");
            }
        });
        File[] fold1 = directoryes.listFiles(); // получаем массив файлов лежащих в директории

        for (File f : fold1){ // выводим список файлов из директории
            System.out.println(f.getName());
        }

        for (File f : fold2){ // выводим список файлов из директории
            System.out.println("только 4 " + f.getName());
        }

    }
}