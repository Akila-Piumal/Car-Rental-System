package lk.ijse.easyCarRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.swing.plaf.synth.SynthDesktopPaneUI;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Car {
    @Id
    String RegNum;
    String name;
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
    String frontImgPath;
    String backImgPath;
    String rightImgPath;
    String leftImgPath;
}
