package lk.ijse.easyCarRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {
    String id;
    String name;
    String address;
    String contactNo;
    String email;
    String licenceNo;
    String role;
    String nicImgPath;
    String licenceImgPath;
}
