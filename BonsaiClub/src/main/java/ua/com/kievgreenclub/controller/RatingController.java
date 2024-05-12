package ua.com.kievgreenclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.kievgreenclub.controller.request.RatingRequest;
import ua.com.kievgreenclub.model.Entities.Rating;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.RatingService;
import ua.com.kievgreenclub.service.UserService;
import ua.com.kievgreenclub.service.exception.ProductException;
import ua.com.kievgreenclub.service.exception.UserException;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @Autowired
    private UserService userService;

    @Autowired
    private RatingService ratingService;

    @PostMapping("/create")
    public ResponseEntity<Rating> createRating(@RequestBody RatingRequest req,
                                               @RequestHeader("Authorization") String jwt) throws UserException, ProductException{
        User user = userService.findUserProfileByJwt(jwt);
        Rating rating = ratingService.createRating(req, user);

        return new ResponseEntity<Rating>(rating, HttpStatus.CREATED);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Rating>> getProductRating(@PathVariable Long productId,
                                                         @RequestHeader("Authorization") String jwt) throws UserException, ProductException{
        User user = userService.findUserProfileByJwt(jwt);
        List<Rating> ratings = ratingService.getProductsRating(productId);

        return new ResponseEntity<>(ratings, HttpStatus.CREATED);
    }

}
