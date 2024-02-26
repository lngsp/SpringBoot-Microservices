package ro.microservice.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.microservice.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
