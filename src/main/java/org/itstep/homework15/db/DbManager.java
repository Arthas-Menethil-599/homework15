package org.itstep.homework15.db;

import org.itstep.homework15.db.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class DbManager {

    private static List<Car> cars = new ArrayList();
    static {
        cars.add(new Car(1L, "S", "Tesla", 5000.00, 100000));
        cars.add(new Car(2L, "X", "Tesla", 7000.00, 200000));
    }

    public static void addCar(Car car) {
        car.setId(cars.get(cars.size()-1).getId() + 1);
        cars.add(car);
    }

    public static List<Car> getAllCars() {
        return cars;
    }
}
