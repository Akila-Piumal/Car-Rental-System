package lk.ijse.easyCarRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.swing.plaf.synth.SynthDesktopPaneUI;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Car {
    @Id
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
