package lk.ijse.easyCarRental.service;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.entity.Car;

import java.util.ArrayList;

public interface CarService {
    ArrayList<CarDTO> getCarsByBrand(String brand);

    ArrayList<CarDTO> getCarsByType(String type);

    ArrayList<CarDTO> getCarsByFuelType(String fuelType);

    ArrayList<CarDTO> getAllCars();
}
