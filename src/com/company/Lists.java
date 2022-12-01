package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Facundo Rocha");
        names.add("Dani");
        names.add("Lucas");
        names.add("Nacho");
        names.add("Richard");

        for (String name: names) {
            System.out.println(name);
        }
    }
}
