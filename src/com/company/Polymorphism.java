package com.company;

public class Polymorphism {
	public static void main(String[] args) {
		Car car = new Car("Subaru", "Impreza STI", "1992", "Black", 25000.00);

		ElectricCar electricCar = new ElectricCar("Tesla", "Model X", "2020", "Black", 70000.00, "electric", 300);

		// polymorphism

		Car car2 = new Car("Mitsubishi", "Lancer Evolution VIII", "2005", "Black", 25000.00);
		
		Car car3 = new ElectricCar("Tesla", "Roadster", "n/a", "Red", 250000.00, "electric", 300);

		if(car3 instanceof Car) {
			System.out.println("Is a car");
		}

		if(car3 instanceof ElectricCar) {
			System.out.println("Is an electric car");
		}
	}
}
