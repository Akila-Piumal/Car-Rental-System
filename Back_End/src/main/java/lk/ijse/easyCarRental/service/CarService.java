package lk.ijse.easyCarRental.service;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.entity.Car;

import java.util.ArrayList;

public interface CarService {
    ArrayList<CarDTO> getCarsByBrand(String brand);

    ArrayList<CarDTO> getCarsByType(String type);

    ArrayList<CarDTO> getCarsByFuelType(String fuelType);

    ArrayList<CarDTO> getCarsByTransmission(String transmission);

    ArrayList<CarDTO> getCarsByPassengerCount(int passengerCount);

    ArrayList<CarDTO> getAllCars();

    ArrayList<CarDTO> filterCar(String brand,String type,String transmissionType,String fuelType,int noOfPassengers);
}
