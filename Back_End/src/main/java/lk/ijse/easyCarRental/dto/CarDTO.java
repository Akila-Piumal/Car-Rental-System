package lk.ijse.easyCarRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarDTO {
    String RegNum;
    String brand;
    String type;
    String color;
    String status;
    int noOfPassengers;
    String transmissionType;
    String fuelType;
    double dailyRate;
    double monthlyRate;
    double freeMileage;
    double priceForExtraKM;
}
