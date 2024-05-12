package ua.com.kievgreenclub.service;

import ua.com.kievgreenclub.model.Entities.Cart;
import ua.com.kievgreenclub.model.Entities.CartItem;
import ua.com.kievgreenclub.model.Entities.Product;
import ua.com.kievgreenclub.service.exception.CartItemException;
import ua.com.kievgreenclub.service.exception.UserException;

public interface CartItemService {

    CartItem createCartItem(CartItem cartItem);

    CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;

    CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

    void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;

    CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
