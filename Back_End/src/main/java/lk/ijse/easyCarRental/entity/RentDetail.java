package lk.ijse.easyCarRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@IdClass(RentCar_PK.class)
public class RentDetail {
    @Id
    Long rentId;
    @Id
    String carId;
    @Id
    String driverId;

    @ManyToOne
    @JoinColumn(name = "rentId",referencedColumnName = "rentId",insertable = false,updatable = false)
    private Rent rent;

    @ManyToOne
    @JoinColumn(name = "carId",referencedColumnName = "RegNum",insertable = false,updatable = false)
    private Car car;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "driverId",referencedColumnName = "licenceNo",insertable = false,updatable = false)
    private Driver driver;
}
