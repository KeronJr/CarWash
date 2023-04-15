package com.car.carwash.repository;

import com.car.carwash.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarWashRepository extends JpaRepository<Car, String> {
}
