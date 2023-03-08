package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.UserDTO;
import lk.ijse.easyCarRental.service.UserService;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;

    @GetMapping(params = "id")
    public ResponseUtil getUserById(String id){
        UserDTO userById = service.getUserById(id);
        return new ResponseUtil("200","success",userById);
    }
}
