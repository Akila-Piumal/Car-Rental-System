package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepo extends JpaRepository<Rent,Long> {

}
