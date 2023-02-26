package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.entity.Car;
import lk.ijse.easyCarRental.repo.CarRepo;
import lk.ijse.easyCarRental.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public ArrayList<CarDTO> getCarsByBrand(String brand) {
        ArrayList<Car> allByBrand = carRepo.findAllByBrand(brand);
        if (allByBrand.size()==0){
            throw new RuntimeException(brand+" Cars Not Available..!");
        }
        return mapper.map(allByBrand,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        List<Car> all = carRepo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }
}



