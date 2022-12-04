package com.company.oop;

public class Person {
    private String name;
    private  String surname;
    private Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void walk(int steps, String direction) {
        int x = 0;
        int z = 0;

        switch (direction) {
            case "Forward":
                z += steps;
                break;
            case "Backward":
                z -= steps;
                break;
            case "Right":
                x += steps;
                break;
            case "Left":
                x -= steps;
                break;
            default:
                System.out.println("No existe el eje");
        }

        System.out.println("Posicion actual eje X: " + x);
        System.out.println("Posicion actual eje Z: " + z);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
