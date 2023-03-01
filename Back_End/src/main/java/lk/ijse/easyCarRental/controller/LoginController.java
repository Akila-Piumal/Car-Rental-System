package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.LogDTO;
import lk.ijse.easyCarRental.dto.LoginDTO;
import lk.ijse.easyCarRental.service.LoginService;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService service;

    @GetMapping
    public ResponseUtil login(@ModelAttribute LogDTO dto){
        LoginDTO loginDTO = service.searchLoginByEmailAndPassword(dto);
        return new ResponseUtil("200","success",loginDTO);
    }

    @PostMapping
    public ResponseUtil saveLogin(@RequestBody LoginDTO dto){
        service.saveLogin(dto);
        return new ResponseUtil("200","Successfully Registered",null);
    }
}
