package ua.com.kievgreenclub.service;

import ua.com.kievgreenclub.controller.request.ReviewRequest;
import ua.com.kievgreenclub.model.Entities.Review;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.service.exception.ProductException;

import java.util.List;

public interface ReviewService {

    Review createReview(ReviewRequest req, User user) throws ProductException;
    List<Review> getAllReview(Long productId);

}
