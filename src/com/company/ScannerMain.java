package com.company;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int number = scanner.nextInt();
        System.out.println("This is your number: " + number);
    }
}
