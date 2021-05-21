package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Food;
import com.example.springdocker.service.CarService;
import com.example.springdocker.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CarController {
    private final CarService service;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return service.getCars();
    }

    @PostMapping("/cars/save")
    public void saveNewCar(@RequestBody Car car) {
        service.saveNewCar(car);
    }

    @GetMapping("/cars/runable") //Vilka bilar som är redo att köras.
    public List<String> getRunableCars() {
        return service.getRunableCars();
    }
}
