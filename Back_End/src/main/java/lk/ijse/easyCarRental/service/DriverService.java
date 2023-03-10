package lk.ijse.easyCarRental.service;

import lk.ijse.easyCarRental.dto.DriverDTO;
import lk.ijse.easyCarRental.entity.Driver;

import java.util.ArrayList;

public interface DriverService {
    ArrayList<DriverDTO> getAllDrivers();
}
