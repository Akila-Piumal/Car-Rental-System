package lk.ijse.easyCarRental.dto;

import lk.ijse.easyCarRental.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RentDTO {
    Long rentId;
    String pickUpDate;
    String pickUpTime;
    String returnDate;
    String status;
    double lossDamageWaiverPrice;
    double total;
    String lossDamageImgPath;
    String userId;
    List<RentDetailsDTO> rentDetail;
}
