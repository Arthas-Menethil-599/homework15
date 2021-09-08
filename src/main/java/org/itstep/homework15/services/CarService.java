package org.itstep.homework15.services;

import org.itstep.homework15.entities.Car;

import java.util.List;

public interface CarService {

    Car addCar(final Car car);

    List<Car> getAllCars();
}
