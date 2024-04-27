package ua.com.kievgreenclub.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.kievgreenclub.Model.Entity.OrderItem;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
        List<OrderItem> findByOrderId(Long orderId);
}
