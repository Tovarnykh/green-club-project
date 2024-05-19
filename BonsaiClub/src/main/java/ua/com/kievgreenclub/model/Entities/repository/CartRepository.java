package ua.com.kievgreenclub.model.Entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.kievgreenclub.model.Entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

    @Query("SELECT c FROM Cart c WHERE c.user.id=:userId")
    Cart findByUserId(@Param("userId") Long userId);

}
