package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.service.CarService;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {

    @Autowired
    CarService service;

    @GetMapping
    public ResponseUtil getAllCars() {
        ArrayList<CarDTO> allCars = service.getAllCars();
        return new ResponseUtil("200", "Success", allCars);
    }

    @PostMapping
    public ResponseUtil saveCar(@RequestBody CarDTO dto){
        System.out.println(dto);
        service.saveCar(dto);
        return new ResponseUtil("200","Car Added.",null);
    }

    @GetMapping(params = "regNo")
    public ResponseUtil getCarByRegNo(String regNo){
        System.out.println("Method called");
//        CarDTO carByRegNo = service.getCarByRegNo(regNo);
        CarDTO dto = service.getCarDetailsByRegNum(regNo);
        return new ResponseUtil("200","Success",dto);
    }


    @GetMapping(path = "/brand/{test}")
    public ResponseUtil getCarsByBrand(@PathVariable("test") String brand) {
        ArrayList<CarDTO> carsByBrand = service.getCarsByBrand(brand);
        return new ResponseUtil("200", "Success", carsByBrand);
    }

    @GetMapping(path = "/type/{test}")
    public ResponseUtil getCarsByType(@PathVariable("test") String type) {
        ArrayList<CarDTO> carsByType = service.getCarsByType(type);
        return new ResponseUtil("200", "Success", carsByType);
    }

    @GetMapping(path = "/fuelType/{test}")
    public ResponseUtil getCarsByFuelType(@PathVariable("test") String fuelType){
        ArrayList<CarDTO> carsByFuelType = service.getCarsByFuelType(fuelType);
        return new ResponseUtil("200","success",carsByFuelType);
    }

    @GetMapping(path = "/transmission/{test}")
    public ResponseUtil getCarsByTransmission(@PathVariable("test") String transmission){
        ArrayList<CarDTO> carsByTransmission = service.getCarsByTransmission(transmission);
        return new ResponseUtil("200","Success",carsByTransmission);
    }

    @GetMapping(path = "/passengerCount/{test}")
    public ResponseUtil getCarsByPassengerCount(@PathVariable("test") int passengerCount){
        ArrayList<CarDTO> carsByPassengerCount = service.getCarsByPassengerCount(passengerCount);
        return new ResponseUtil("200","success",carsByPassengerCount);
    }

    @GetMapping(path = "/filter/{brand}/{type}/{passengerCount}/{transmissionType}/{fuelType}")
    public ResponseUtil filterCar(@PathVariable("brand") String brand,@PathVariable("type") String type,@PathVariable("passengerCount") String passengerCount,@PathVariable("transmissionType") String transmissionType,@PathVariable("fuelType") String fuelType ){
        ArrayList<CarDTO> cars = service.filterCar(brand, type, transmissionType, fuelType, Integer.parseInt(passengerCount));
        return new ResponseUtil("200","success",cars);
    }

}