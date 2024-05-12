package ua.com.kievgreenclub.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.kievgreenclub.model.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
