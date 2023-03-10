package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.DriverDTO;
import lk.ijse.easyCarRental.entity.Driver;
import lk.ijse.easyCarRental.repo.DriverRepo;
import lk.ijse.easyCarRental.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public ArrayList<DriverDTO> getAllDrivers() {
        List<Driver> all = repo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<DriverDTO>>(){}.getType());
    }
}
