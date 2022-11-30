package com.company;

public class ElectricCar extends Car {

    private String engine;
    private Integer batteryAutonomy;

    public ElectricCar(String brand, String model, String year, String color, Double price, String engine, Integer batteryAutonomy) {
        super(brand, model, year, color, price);
        this.engine = engine;
        this.batteryAutonomy = batteryAutonomy;
    }

		@Override // overrides base class (car) method speedup 
		public void speedup(Integer quantity) {
			Integer adjustedQuantity = quantity * 2;
			super.speedup(adjustedQuantity);
		}

    public String toString() {
        return "Car {" +
                "brand: '" + brand + "\'" +
                ", model: '" + model + "\'" +
                ", year: '" + year + "\'" +
                ", color: '" + color + "\'" +
                ", price: '" + price + "\'" +
                ", engine: '" + engine + "\'" +
                ", autonomy: '" + batteryAutonomy + "Km" + "\'" +
                '}';
    }
}
