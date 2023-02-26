package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.service.CarService;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {

    @Autowired
    CarService service;

    @GetMapping(params = "brand")
    public ResponseUtil getCarsByBrand(@Param("brand") String brand){
        ArrayList<CarDTO> carsByBrand = service.getCarsByBrand(brand);
        return new ResponseUtil("200","Success",carsByBrand);
    }

    @GetMapping
    public ResponseUtil getAllCars(){
        ArrayList<CarDTO> allCars = service.getAllCars();
        return new ResponseUtil("200","Success",allCars);
    }
}