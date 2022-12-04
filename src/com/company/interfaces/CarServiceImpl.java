package com.company.interfaces;

import com.company.oop.Car;

public class CarServiceImpl implements CarService {

    public String washCar(Car car) {
        return "Your " + car.model + " is now clean AF";
    }

    public String maintainCar(Car car) {
        return "Your " + car.model + " maintenance was done";
    }

    String name = "Nombre";

    public String repairCar(Car car) {
        return "The repair of your " + car.model + " was made";
    }
}
