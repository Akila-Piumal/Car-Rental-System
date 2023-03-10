package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver,String> {
}
