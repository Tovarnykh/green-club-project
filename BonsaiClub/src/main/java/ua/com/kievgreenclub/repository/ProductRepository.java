package ua.com.kievgreenclub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import ua.com.kievgreenclub.model.Entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> filterProducts(@Param("category") String category);

}
