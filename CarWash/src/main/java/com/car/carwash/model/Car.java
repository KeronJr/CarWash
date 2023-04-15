package com.car.carwash.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Car")
public class Car {
    @Id
    private String Plate_no;
    private String Names;
    private String Email;
    private String Phone;

//    @CreationTimestamp
    private LocalDate date;
}
