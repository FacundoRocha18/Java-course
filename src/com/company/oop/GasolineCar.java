package com.company.oop;

public class GasolineCar extends Car {

    private String gasolineType;
    private Integer gasolineCapacity;

    public GasolineCar(String brand, String model, String year, String color, Double price, String gasolineType, Integer gasolineCapacity) {
        super(brand, model, year, color, price);
        this.gasolineType = gasolineType;
        this.gasolineCapacity = gasolineCapacity;
    }

    public String toString() {
        return "Car {" +
                "brand: '" + brand + "\'" +
                ", model: '" + model + "\'" +
                ", year: '" + year + "\'" +
                ", color: '" + color + "\'" +
                ", price: '" + price + "\'" +
                ", gasoline type: '" + gasolineType + "\'" +
                ", gasoline capacity: '" + gasolineCapacity + "lts" + "\'" +
                '}';
    }
}
