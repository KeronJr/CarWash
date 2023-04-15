package com.car.carwash.service;

import com.car.carwash.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarWashService {

    Car saveCarWash(Car car);
    void deleteByPlate(String id);
    List<Car> getAllCarList();
    Optional<Car> getAllCarsByPlate(String id);
}
