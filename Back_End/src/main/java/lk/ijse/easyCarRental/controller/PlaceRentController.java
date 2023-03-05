package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.RentDTO;
import lk.ijse.easyCarRental.service.PlaceRentService;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rent")
@CrossOrigin
public class PlaceRentController {

    @Autowired
    PlaceRentService service;

    @PostMapping
    public ResponseUtil placeRent(@RequestBody RentDTO dto){
        service.placeRent(dto);
        return new ResponseUtil("200","success",null);
    }
}

