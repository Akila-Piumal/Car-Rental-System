package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.dto.RentDTO;
import lk.ijse.easyCarRental.service.RentService;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rent")
@CrossOrigin
public class RentController {

    @Autowired
    RentService service;

    @PostMapping
    public ResponseUtil placeRent(@RequestBody RentDTO dto){
        service.placeRent(dto);
        return new ResponseUtil("200","success",null);
    }

    @GetMapping
    public ResponseUtil getAll(){
        ArrayList<RentDTO> all = service.getAll();
        return new ResponseUtil("200","success",all);
    }

    @GetMapping(params = "rentId")
    public ResponseUtil getCRentByRentID(Long rentId){
        RentDTO byId = service.getById(rentId);
        return new ResponseUtil("200","Success",byId);
    }

    @GetMapping(path = "/getLastOne")
    public ResponseUtil getLastOne(){
        RentDTO lastRent = service.getLastRent();
        return new ResponseUtil("200","success",lastRent);
    }

    @GetMapping(params = "userId")
    public ResponseUtil getRentByUserId(String userId){
        ArrayList<RentDTO> allByCustomerId = service.getByCustomerId(userId);
        return new ResponseUtil("200","Success",allByCustomerId);
    }

    @PutMapping(params = {"rentId","driverId"})
    public ResponseUtil updateStatusAndDriver(Long rentId, String driverId){
        boolean result = service.updateStatus("booked",rentId,driverId);
        return new ResponseUtil("200","Success",null);
    }
}

