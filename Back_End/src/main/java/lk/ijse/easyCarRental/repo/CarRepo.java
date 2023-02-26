package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface CarRepo extends JpaRepository<Car,String> {

    ArrayList<Car> findAllByBrand(String brand);
}
