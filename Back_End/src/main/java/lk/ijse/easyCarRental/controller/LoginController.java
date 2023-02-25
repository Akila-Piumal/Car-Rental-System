package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.LoginDTO;
import lk.ijse.easyCarRental.service.LoginService;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService service;

    @PostMapping
    public ResponseUtil saveLogin(@RequestBody LoginDTO dto){
        service.saveLogin(dto);
        return new ResponseUtil("200",dto.getId()+"Successfully Registered",null);
    }
}
