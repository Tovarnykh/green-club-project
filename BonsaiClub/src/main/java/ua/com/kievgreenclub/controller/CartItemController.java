package ua.com.kievgreenclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.kievgreenclub.ApiResponse;
import ua.com.kievgreenclub.model.Entities.CartItem;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.CartItemService;
import ua.com.kievgreenclub.service.UserService;
import ua.com.kievgreenclub.service.exception.CartItemException;
import ua.com.kievgreenclub.service.exception.UserException;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

    @Autowired
    UserService userService;
    @Autowired
    CartItemService cartItemService;

    @DeleteMapping("/{cartItemId}")
    public ResponseEntity<ApiResponse> deleteCartItem(
            @PathVariable Long cartItemId,
            @RequestHeader("Authorization") String jwt) throws UserException, CartItemException{
        User user = userService.findUserProfileByJwt(jwt);

        cartItemService.removeCartItem(user.getId(), cartItemId);

        ApiResponse res = new ApiResponse();
        res.setMessage("item deleted from cart");
        res.setStatus(true);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("/{cartItemId}")
    public ResponseEntity<CartItem> updateCartItem(
            @RequestBody CartItem cartItem,
            @PathVariable Long cartItemId,
            @RequestHeader("Authorization") String jwt) throws UserException, CartItemException {
        User user = userService.findUserProfileByJwt(jwt);
        CartItem updatedCartItem = cartItemService.updateCartItem(user.getId(), cartItemId, cartItem);

        return new ResponseEntity<>(updatedCartItem, HttpStatus.OK);
    }

}
