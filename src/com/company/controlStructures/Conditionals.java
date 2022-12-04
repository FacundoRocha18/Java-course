package com.company.controlStructures;

public class Conditionals {
    public static void main(String[] args) {
        boolean check = 5 > 10;

        // Basic if sentence
        if(check) {
            System.out.println("Condition is true");
        }

        // Basic one line if sentence
        if(check) System.out.println("Condition is true");

        // Basic ifElse sentence
        if(check) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        // ifElseIf sentence
        if(check) {
            System.out.println("Condition is true");
        } else if (!check){
            System.out.println("Condition is false");
        }

        // guard clause type if with negated condition
        if(!check) {
            System.out.println("Condition is false");
            return;
        }

        System.out.println("Condition is true");
        return;
    }
}
