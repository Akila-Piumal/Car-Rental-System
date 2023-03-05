package lk.ijse.easyCarRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Rent {
    @Id
    Long rentId;
    String pickUpDate;
    String pickUpTime;
    String returnDate;
    String status;
    double lossDamageWaiverPrice;
    double total;
    String lossDamageImgPath;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "userId",referencedColumnName = "id",nullable = false)
    private User userId;


    @OneToMany(mappedBy = "rent",cascade = CascadeType.ALL)
    private List<RentDetail> rentDetail;

}
