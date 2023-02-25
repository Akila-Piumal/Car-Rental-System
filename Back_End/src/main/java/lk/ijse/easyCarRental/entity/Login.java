package lk.ijse.easyCarRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Login {
    @Id
    private String id;
    private String userName;
    private String password;
    private String status;
    @OneToOne()
    private User user;
}
