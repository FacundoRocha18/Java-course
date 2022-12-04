package com.company.controlStructures;

public class SwitchCase {

    public static void main(String[] args) {

        int count = 0;
        while (count < 4) {
            switch (count) {
                case 1:
                    System.out.println("Hello world!");
                    break;
                case 2:
                    System.out.println("My name is Facu");
                    break;
                case 3:
                    System.out.println("Bye world!");
                    break;
                default:
                    System.out.println("Default case");
            }
            count++;
        }
    }
}
