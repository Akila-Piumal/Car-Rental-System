package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.config.WebRootConfig;
import lk.ijse.easyCarRental.dto.LoginDTO;
import lk.ijse.easyCarRental.entity.User;
import lk.ijse.easyCarRental.service.LoginService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class LoginServiceImplTest {

    @Autowired
    LoginService loginService;

    @Test
    public void saveLogin(){
//        LoginDTO dto=new LoginDTO("991042199V","Akila","1234","login",new User("991042199V","Akila Pumal","Mathugama","0783223485","Akilapiumal16@","123445555"));
//        loginService.saveLogin(dto);
    }

}