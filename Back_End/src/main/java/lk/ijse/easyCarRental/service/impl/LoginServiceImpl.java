package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.LoginDTO;
import lk.ijse.easyCarRental.repo.LoginRepo;
import lk.ijse.easyCarRental.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveLogin(LoginDTO dto) {

    }
}
