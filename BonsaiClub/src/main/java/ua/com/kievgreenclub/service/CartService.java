package ua.com.kievgreenclub.service;

import ua.com.kievgreenclub.controller.request.AddItemRequest;
import ua.com.kievgreenclub.model.Entities.Cart;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.exception.ProductException;

public interface CartService {

    Cart createCart(User user);

    String addCartItem(Long userId, AddItemRequest req) throws ProductException;

    Cart findUserCart(Long userId);

}
