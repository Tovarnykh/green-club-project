package ua.com.kievgreenclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.kievgreenclub.ApiResponse;
import ua.com.kievgreenclub.controller.request.AddItemRequest;
import ua.com.kievgreenclub.model.Entities.Cart;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.CartService;
import ua.com.kievgreenclub.service.UserService;
import ua.com.kievgreenclub.service.exception.ProductException;
import ua.com.kievgreenclub.service.exception.UserException;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<Cart> findUserCart(@RequestHeader("Authorization")String jwt) throws UserException{
        User user = userService.findUserProfileByJwt(jwt);
        Cart cart = cartService.findUserCart(user.getId());

        return new ResponseEntity<Cart>(cart, HttpStatus.OK);
    }

    @GetMapping("/add")
    public ResponseEntity<ApiResponse> addItemToCart(@RequestHeader AddItemRequest req,
                                                     @RequestHeader("Authorization")String jwt)
            throws UserException, ProductException {
        User user = userService.findUserProfileByJwt(jwt);

        cartService.addCartItem(user.getId(), req);

        ApiResponse res = new ApiResponse();
        res.setMessage("item added to cart");
        res.setStatus(true);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
