package lk.ijse.easyCarRental.service;

import lk.ijse.easyCarRental.dto.RentDTO;
import lk.ijse.easyCarRental.entity.Rent;

import java.util.ArrayList;

public interface RentService {
    void placeRent(RentDTO dto);

    ArrayList<RentDTO> getAll();

    RentDTO getById(Long rentId);

    RentDTO getLastRent();

    ArrayList<RentDTO> getByCustomerId(String userId);
}
