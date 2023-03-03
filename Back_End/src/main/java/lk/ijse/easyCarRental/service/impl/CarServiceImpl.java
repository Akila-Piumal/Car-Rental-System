package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.entity.Car;
import lk.ijse.easyCarRental.repo.CarRepo;
import lk.ijse.easyCarRental.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public ArrayList<CarDTO> getCarsByBrand(String brand) {
        ArrayList<Car> allByBrand = carRepo.findAllByBrand(brand);
        if (allByBrand.size()==0){
            throw new RuntimeException(brand+" Cars Not Available..!");
        }
        return mapper.map(allByBrand,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public ArrayList<CarDTO> getCarsByType(String type) {
        ArrayList<Car> allByType = carRepo.findAllByType(type);
        if (allByType.size()==0){
            throw new RuntimeException(type+" Cars not available");
        }
        return mapper.map(allByType,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public ArrayList<CarDTO> getCarsByFuelType(String fuelType) {
        ArrayList<Car> allByFuelType = carRepo.findAllByFuelType(fuelType);
        if (allByFuelType.size()==0){
            throw new RuntimeException(fuelType+" Cars not available");
        }
        return mapper.map(allByFuelType,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public ArrayList<CarDTO> getCarsByTransmission(String transmission) {
        ArrayList<Car> allByTransmissionType = carRepo.findAllByTransmissionType(transmission);
        if (allByTransmissionType.size()==0){
            throw new RuntimeException(transmission+" Cars not available");
        }
        return mapper.map(allByTransmissionType,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public ArrayList<CarDTO> getCarsByPassengerCount(int passengerCount) {
        ArrayList<Car> allByNoOfPassengers = carRepo.findAllByNoOfPassengers(passengerCount);
        if (allByNoOfPassengers.size()==0){
            throw new RuntimeException(passengerCount+" Seats Cars not available");
        }
        return mapper.map(allByNoOfPassengers,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        List<Car> all = carRepo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public ArrayList<CarDTO> filterCar(String brand, String type, String transmissionType, String fuelType, int noOfPassengers) {
        ArrayList<Car> all = carRepo.findAllByBrandAndTypeAndTransmissionTypeAndFuelTypeAndNoOfPassengers(brand, type, transmissionType, fuelType, noOfPassengers);
        if (all.size()==0){
            throw new RuntimeException("No Available cars..");
        }
        return mapper.map(all,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }
}



