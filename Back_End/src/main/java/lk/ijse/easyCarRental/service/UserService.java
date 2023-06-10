package lk.ijse.easyCarRental.service;

import lk.ijse.easyCarRental.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    UserDTO getUserById(String id);

    ArrayList<UserDTO> getAll();
}
