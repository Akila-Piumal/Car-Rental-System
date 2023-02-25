package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,String> {
}
