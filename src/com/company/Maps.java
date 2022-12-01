package com.company;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<>();

        persons.put("5.459.133-4", new Person("Facundo", "Rocha", 21));
        persons.put("5.839.214-3", new Person("Nacho", "Arias", 24));

        for(String key: persons.keySet()) { // logs persons keys
            System.out.println(key);
        }

        for(Person value: persons.values()) { // logs persons values
            System.out.println(value);
        }

        for(Map.Entry<String, Person>  pair : persons.entrySet()) { // logs both persons keys and values
            System.out.println("CI: " + pair.getKey() + ": " + pair.getValue());
        }
    }
}
