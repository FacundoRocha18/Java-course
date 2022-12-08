package com.company.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

    public static void main(String[] args) {
        FileWriter file = null;

        try {
            file = new FileWriter("C:\\Users\\facun\\Desktop\\Development\\OpenBootcamp\\java\\Java-course\\helloworld.txt", true);

            file.write(" New line" );
            file.close();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
