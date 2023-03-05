package lk.ijse.easyCarRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Driver {
    @Id
    String licenceNo;
    String name;
    String address;
    String contactNo;
    String status;

    @OneToMany(mappedBy = "driver",cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    private List<RentDetail> rentDetails;
}
