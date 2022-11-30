package com.company;

public class Car {
    protected String brand;
    protected String model;
    protected String year;
    protected String color;
    protected Double price;
    protected Integer speed = 0;

    public Car(String brand, String model, String year, String color, Double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void speedup (Integer quantity) {
        if(quantity < 0 || quantity > 120 ) {
            System.out.println("Speed cannot be negative or bigger than 120");
            return;
        }

        this.speed += quantity;
        System.out.println("The speed is: " + this.speed + "mph");
    }

    public String toString() {
        return "Car {" +
                "brand: '" + brand + "\'" +
                ", model: '" + model + "\'" +
                ", year: '" + year + "\'" +
                ", color: '" + color + "\'" +
                ", price: '" + price + "\'" +
                '}';
    }
}
