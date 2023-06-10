package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.RentDTO;
import lk.ijse.easyCarRental.entity.Car;
import lk.ijse.easyCarRental.entity.Rent;
import lk.ijse.easyCarRental.entity.RentDetail;
import lk.ijse.easyCarRental.repo.CarRepo;
import lk.ijse.easyCarRental.repo.RentRepo;
import lk.ijse.easyCarRental.service.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    RentRepo rentRepo;

    @Autowired
    CarRepo carRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void placeRent(RentDTO dto) {
        Rent rent = mapper.map(dto, Rent.class);

        if (rentRepo.existsById(dto.getRentId())) {
            throw new RuntimeException("Rent : "+rent.getRentId()+" Already Exists.");
        }

        rentRepo.save(rent);

        for (RentDetail rentDetail : rent.getRentDetail()) {
            Optional<Car> resp = carRepo.findById(rentDetail.getCarId());
            if (!resp.isPresent()){
                throw new RuntimeException(rentDetail.getCarId()+": Car Not Available");
            }

            Car car = resp.get();
            car.setStatus("rented");
            carRepo.save(car);
        }
    }

    @Override
    public ArrayList<RentDTO> getAll() {
        List<Rent> all = rentRepo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<RentDTO>>(){}.getType());
    }

    @Override
    public RentDTO getById(Long rentId) {
        Rent byRentId = rentRepo.findByRentId(rentId);
        return mapper.map(byRentId,RentDTO.class);
    }

    @Override
    public RentDTO getLastRent() {
        Rent lastRent = rentRepo.getLastRentFromNative();
        return mapper.map(lastRent,RentDTO.class);
    }
}