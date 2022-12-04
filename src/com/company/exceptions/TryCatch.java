package com.company.exceptions;

public class TryCatch {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) { // catches exceptions without breaking the app
            e.printStackTrace();
        }

        System.out.println("fin");
    }
}
