package com.company.controlStructures;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;

        System.out.println("Loop is active");

        while (count < 10) {

            System.out.println(count);
            if(count == 4) break; // breaks the loop execution flow
            // if(count == 4) continue; skips the value 4 and continues with the next iteration
            count++;
        }

        System.out.println("Loop is inactive");
    }
}
