package ua.com.kievgreenclub.model.Entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.kievgreenclub.model.Entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
