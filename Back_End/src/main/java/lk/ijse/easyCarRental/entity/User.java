package lk.ijse.easyCarRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    @Id
    String id;
    String name;
    String address;
    String contactNo;
    String email;
    String licenceNo;
    String role;
}
