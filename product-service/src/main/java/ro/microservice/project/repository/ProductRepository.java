package ro.microservice.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.microservice.project.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
