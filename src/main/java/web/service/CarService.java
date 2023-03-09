package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getNCars(int n);
    List<Car> listCars();
}