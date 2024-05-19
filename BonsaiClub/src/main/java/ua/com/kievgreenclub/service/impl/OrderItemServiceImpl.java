package ua.com.kievgreenclub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.kievgreenclub.model.Entities.OrderItem;
import ua.com.kievgreenclub.model.Entities.repository.OrderItemRepository;
import ua.com.kievgreenclub.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

}
