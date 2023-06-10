package lk.ijse.easyCarRental.service.impl;

import lk.ijse.easyCarRental.dto.CarDTO;
import lk.ijse.easyCarRental.dto.UserDTO;
import lk.ijse.easyCarRental.entity.User;
import lk.ijse.easyCarRental.repo.UserRepo;
import lk.ijse.easyCarRental.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public UserDTO getUserById(String id) {
        User byId = userRepo.getById(id);
        return mapper.map(byId,UserDTO.class);
    }

    @Override
    public ArrayList<UserDTO> getAll() {
        List<User> all = userRepo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<UserDTO>>(){}.getType());
    }
}
