package com.company.io;

import java.io.*;

public class FileReadExample {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\facun\\Desktop\\Development\\OpenBootcamp\\java\\Java-course\\helloworld.txt");

            FileReader reader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
