package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface CarRepo extends JpaRepository<Car,String> {

    ArrayList<Car> findAllByBrand(String brand);

    ArrayList<Car> findAllByFuelType(String fuelType);

    ArrayList<Car> findAllByTransmissionType(String transmission);

    ArrayList<Car> findAllByType(String type);

    ArrayList<Car> findAllByNoOfPassengers(int passengerCount);

    ArrayList<Car> findAllByBrandAndTypeAndTransmissionTypeAndFuelTypeAndNoOfPassengers(String brand, String type, String transmissionType, String fuelType, int noOfPassengers);

    @Query(value = "SELECT * FROM Car WHERE regNum=?1",nativeQuery = true)
    Car getCarDetailsFromNativeQuery(String regNum);
}
