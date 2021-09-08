package org.itstep.homework15.services;

import org.itstep.homework15.entities.Car;
import org.itstep.homework15.repositories.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final CarRepository repository;

    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public Car addCar(Car car) {
        return repository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }
}
