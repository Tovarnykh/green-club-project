package ua.com.kievgreenclub.service.impl;

import org.springframework.stereotype.Service;
import ua.com.kievgreenclub.controller.request.ReviewRequest;
import ua.com.kievgreenclub.model.Entities.Product;
import ua.com.kievgreenclub.model.Entities.Review;
import ua.com.kievgreenclub.model.Entities.User;
import ua.com.kievgreenclub.model.repository.ProductRepository;
import ua.com.kievgreenclub.model.repository.ReviewRepository;
import ua.com.kievgreenclub.service.ProductService;
import ua.com.kievgreenclub.service.ReviewService;
import ua.com.kievgreenclub.service.exception.ProductException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;
    private ProductService productService;
    private ProductRepository productRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository, ProductService productService, ProductRepository productRepository) {
        this.reviewRepository = reviewRepository;
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @Override
    public Review createReview(ReviewRequest req, User user) throws ProductException {
        Product product = productService.findProductById(req.getProductId());
        Review review = new Review();

        review.setUser(user);
        review.setProduct(product);
        review.setReview(req.getReview());
        review.setCreatedAt(LocalDateTime.now());

        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReview(Long productId) {
        return reviewRepository.getAllProductsReview(productId);
    }

}
