package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.LogDTO;
import lk.ijse.easyCarRental.dto.LoginDTO;
import lk.ijse.easyCarRental.entity.Login;
import lk.ijse.easyCarRental.entity.User;
import lk.ijse.easyCarRental.repo.LoginRepo;
import lk.ijse.easyCarRental.repo.UserRepo;
import lk.ijse.easyCarRental.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepo loginRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveLogin(LoginDTO dto) {
        if (loginRepo.existsById(dto.getId())){
            throw new RuntimeException("This id number already registered. Please login.");
        }

        User user = mapper.map(dto.getUserDet(), User.class);
        userRepo.save(user);
        Login log = mapper.map(dto, Login.class);
        loginRepo.save(log);
    }

    @Override
    public LoginDTO searchLoginByEmailAndPassword(LogDTO dto) {
        Login loginByEmailAndPassword = loginRepo.findLoginByEmailAndPassword(dto.getEmail(), dto.getPassword());
        if (loginByEmailAndPassword==null){
            throw new RuntimeException("Email or Password in Incorrect..!");
        }
        return mapper.map(loginByEmailAndPassword,LoginDTO.class);
    }
}
