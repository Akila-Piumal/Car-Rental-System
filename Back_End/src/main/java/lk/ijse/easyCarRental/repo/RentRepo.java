package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.Car;
import lk.ijse.easyCarRental.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface RentRepo extends JpaRepository<Rent,Long> {
    Rent findByRentId(Long rentId);

    @Query(value = "SELECT * FROM rent ORDER BY rentId DESC LIMIT 1",nativeQuery = true)
    Rent getLastRentFromNative();

    @Query(value = "SELECT * FROM rent where userId=?1" , nativeQuery = true)
    List<Rent> findAllByUserId(String userId);
}
