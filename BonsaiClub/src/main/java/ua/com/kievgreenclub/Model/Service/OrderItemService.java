package ua.com.kievgreenclub.Model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.kievgreenclub.Model.Entity.OrderItem;
import ua.com.kievgreenclub.Model.Repository.OrderItemRepository;

import java.util.List;
import java.util.Optional;

public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public OrderItem saveOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public Optional<OrderItem> findOrderItemById(Long id) {
        return orderItemRepository.findById(id);
    }

    public List<OrderItem> findOrderItemsByOrderId(Long orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }

}
