package com.mzapart.carrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mzapart.carrental.*;
import com.mzapart.carrental.dto.CarDto;
import com.mzapart.carrental.dto.CreateCarRequest;

import java.util.ArrayList;
import java.util.List;
@RestController()

class CarController {

    @Autowired
    CarDetailsRepository repository;

    @GetMapping(value = "/cars/{carId}")
    ResponseEntity<CarDto> detailsForCar(@PathVariable String carId) {

        return repository.findById(carId)
                .map(car -> car.snapshot())
                .map(dto -> ResponseEntity.ok(dto))
                .orElseThrow(()-> new RuntimeException());

    }

    @GetMapping("/cars")
    List<CarDto> list() {
        List<CarDto> list = new ArrayList<>();

        repository.findAll()
                .iterator()
                .forEachRemaining(car -> list.add(car.snapshot()));

        return list;
    }

    @PostMapping("/cars/{carId}")
    ResponseEntity car(@PathVariable String carId, @RequestBody CreateCarRequest r) {

        repository.save(Car.withCreateRequest(carId, r));

        return ResponseEntity.noContent().build();

    }

}