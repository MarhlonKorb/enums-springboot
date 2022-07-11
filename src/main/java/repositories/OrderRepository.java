package repositories;

import model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class OrderRepository implements JpaRepository<Order, Long> {
}
