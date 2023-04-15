package com.car.carwash.service;

import com.car.carwash.model.Car;
import com.car.carwash.repository.CarWashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarWashImplementation implements CarWashService{
    private final CarWashRepository repo;


    public CarWashImplementation(CarWashRepository repo) {
        this.repo = repo;
    }

    @Override
    public Car saveCarWash(Car car) {
        return repo.save(car);
       // return car;
    }

    @Override
    public void deleteByPlate(String Plate_no) {
        repo.deleteById(Plate_no);
    }

    @Override
    public List<Car> getAllCarList() {
        return repo.findAll();
    }

    @Override
    public Optional<Car> getAllCarsByPlate(String Plate_no) {
        return repo.findById(Plate_no);
    }


}
