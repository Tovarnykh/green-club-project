package ua.com.kievgreenclub.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.kievgreenclub.model.Entities.Rating;

import java.util.List;

public interface RatingRepository extends JpaRepository <Rating, Long> {

    @Query("select r from Rating r where r.product.id=:productId")
    List<Rating> getAllProductsRating(@Param("productId")Long productId);

}
