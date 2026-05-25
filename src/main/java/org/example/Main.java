package org.example;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("folder/users.usr");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        User user = new User("John", "Smith", 25, new Address("Main", 10));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(user);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            User saveduser = (User) objectInputStream.readObject();
            System.out.println(saveduser);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

