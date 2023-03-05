package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.RentDTO;
import lk.ijse.easyCarRental.entity.Rent;
import lk.ijse.easyCarRental.repo.RentRepo;
import lk.ijse.easyCarRental.service.PlaceRentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlaceRentServiceImpl implements PlaceRentService {

    @Autowired
    RentRepo rentRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void placeRent(RentDTO dto) {
        Rent rent = mapper.map(dto, Rent.class);
        rentRepo.save(rent);
    }
}
