package lk.ijse.easyCarRental.service;

import lk.ijse.easyCarRental.dto.RentDTO;
import lk.ijse.easyCarRental.dto.RentDetailsDTO;
import lk.ijse.easyCarRental.entity.Rent;
import lk.ijse.easyCarRental.entity.RentDetail;

import java.util.ArrayList;
import java.util.List;

public interface RentService {
    void placeRent(RentDTO dto);

    ArrayList<RentDTO> getAll();

    RentDTO getById(Long rentId);

    RentDTO getLastRent();

    ArrayList<RentDTO> getByCustomerId(String userId);

    boolean updateStatus(String status,Long rentId,String driverId);

    List<RentDetailsDTO> findByRentId(Long rentId);

}
