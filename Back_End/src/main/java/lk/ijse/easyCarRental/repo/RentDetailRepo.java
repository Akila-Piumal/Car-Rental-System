package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.Rent;
import lk.ijse.easyCarRental.entity.RentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface RentDetailRepo extends JpaRepository<RentDetail,Long> {

    @Modifying
    @Query(value = "UPDATE rentDetail SET driverId=?1 WHERE rentId=?2", nativeQuery = true)
    int updateDriverId(String driverId, Long rentId);

    @Query(value = "SELECT * FROM rentDetail WHERE rentId=?1",nativeQuery = true)
    List<RentDetail> findByRentId(Long rentId);
}
