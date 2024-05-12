package ua.com.kievgreenclub.service;

import org.springframework.data.domain.Page;
import ua.com.kievgreenclub.controller.request.CreateProductRequest;
import ua.com.kievgreenclub.model.Entities.Product;
import ua.com.kievgreenclub.service.exception.ProductException;

import java.util.List;

public interface ProductService {

    Product createProduct(CreateProductRequest req);

    String deleteProduct(Long productId) throws ProductException;

    Product updateProduct(Long productId, Product req) throws ProductException;

    Product findProductById(Long id) throws ProductException;

    List<Product> findProductByCategory(String category);

    List<Product> findAllProducts();

    Page<Product> getAllProduct(String category, List<String> sizes, Integer minPrice,
                                Integer maxPrice, Integer minDiscount,
                                String sort, String stock, Integer pageNumber, Integer pageSize);

}
