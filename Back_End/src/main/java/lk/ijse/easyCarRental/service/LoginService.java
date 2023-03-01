package lk.ijse.easyCarRental.service;

import lk.ijse.easyCarRental.dto.LogDTO;
import lk.ijse.easyCarRental.dto.LoginDTO;

public interface LoginService {
    void saveLogin(LoginDTO dto);

    LoginDTO searchLoginByEmailAndPassword(LogDTO dto);
}
