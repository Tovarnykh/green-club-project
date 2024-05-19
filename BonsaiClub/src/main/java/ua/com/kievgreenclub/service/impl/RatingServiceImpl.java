package ua.com.kievgreenclub.service.impl;

import org.springframework.stereotype.Service;
import ua.com.kievgreenclub.controller.request.RatingRequest;
import ua.com.kievgreenclub.model.Entities.Product;
import ua.com.kievgreenclub.model.Entities.Rating;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.model.Entities.repository.RatingRepository;
import ua.com.kievgreenclub.service.ProductService;
import ua.com.kievgreenclub.service.RatingService;
import ua.com.kievgreenclub.service.exception.ProductException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    private RatingRepository ratingRepository;
    private ProductService productService;

    public RatingServiceImpl(RatingRepository ratingRepository, ProductService productService) {
        this.ratingRepository = ratingRepository;
        this.productService = productService;
    }

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {
        Product product = productService.findProductById(req.getProductId());

        Rating rating = new Rating();

        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductsRating(Long productId) {
        return ratingRepository.getAllProductsRating(productId);
    }

}
