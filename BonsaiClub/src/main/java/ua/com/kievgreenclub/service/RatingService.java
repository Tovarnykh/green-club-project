package ua.com.kievgreenclub.service;

import ua.com.kievgreenclub.controller.request.RatingRequest;
import ua.com.kievgreenclub.model.Entities.Rating;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.exception.ProductException;

import java.util.List;

public interface RatingService {

    Rating createRating(RatingRequest req, User user) throws ProductException;

    List<Rating> getProductsRating(Long productId);

}
