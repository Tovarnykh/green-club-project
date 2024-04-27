package ua.com.kievgreenclub.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.kievgreenclub.Model.Entity.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
        List<Order> findByUserId(Long userId);
}
