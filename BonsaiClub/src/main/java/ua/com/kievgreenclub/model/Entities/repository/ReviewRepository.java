package ua.com.kievgreenclub.model.Entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.kievgreenclub.model.Entities.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("SELECT r FROM Review r where r.product.id=:productId")
    List<Review> getAllProductsReview(@Param("productId")Long productId);

}
