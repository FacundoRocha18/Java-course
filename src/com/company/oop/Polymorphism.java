package com.company.oop;

public class Polymorphism {
	public static void main(String[] args) {
		Car car = new GasolineCar("Subaru", "Impreza STI", "1992", "Black", 25000.00, "gasoline", 100);

		ElectricCar electricCar = new ElectricCar("Tesla", "Model X", "2020", "Black", 70000.00, "electric", 300);

		// polymorphism

		Car car2 = new GasolineCar("Mitsubishi", "Lancer Evolution VIII", "2005", "Black", 25000.00, "gasoline", 100);
		
		Car car3 = new ElectricCar("Tesla", "Roadster", "n/a", "Red", 250000.00, "electric", 300);


		if(car2 instanceof GasolineCar || car2 instanceof Car) {
			System.out.println("Is a gasoline car");
		}

		if(car3 instanceof ElectricCar) {
			System.out.println("Is an electric car");
		}
	}
}
