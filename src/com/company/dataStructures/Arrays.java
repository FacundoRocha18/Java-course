package com.company.dataStructures;

public class Arrays {

    public static void main(String[] args) {

        String[] names = new String[]{"Facundo", "Dani", "Lucas", "Richard", "Nacho"};

        String[] cars = new String[5];

        cars[0] = "Mazda";

        for(int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}
