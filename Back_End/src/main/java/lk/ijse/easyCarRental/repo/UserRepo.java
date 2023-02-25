package lk.ijse.easyCarRental.repo;

import lk.ijse.easyCarRental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
