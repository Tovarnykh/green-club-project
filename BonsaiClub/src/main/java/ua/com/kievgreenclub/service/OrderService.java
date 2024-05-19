package ua.com.kievgreenclub.service;

import ua.com.kievgreenclub.model.Entities.Address;
import ua.com.kievgreenclub.model.Entities.Order;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.exception.OrderException;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, Address shippingAddress);

    Order findOrderById(Long orderId) throws OrderException;

    List<Order> usersOrderHistory(Long userId);

    Order placedOrder (Long orderId) throws OrderException;

    Order confirmedOrder(Long orderId) throws OrderException;

    Order shippedOrder(Long orderId) throws OrderException;

    Order deliveredOrder(Long orderId) throws OrderException;

    Order canceledOrder(Long orderId) throws OrderException;

    List<Order> getAllOrders();

    void deleteOrder(Long orderId) throws OrderException;

}
