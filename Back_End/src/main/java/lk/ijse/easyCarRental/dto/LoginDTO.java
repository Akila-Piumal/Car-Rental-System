package lk.ijse.easyCarRental.dto;

import lk.ijse.easyCarRental.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class LoginDTO {
    private String id;
    private String email;
    private String password;
//    private String status;
    private User userDet;
}
