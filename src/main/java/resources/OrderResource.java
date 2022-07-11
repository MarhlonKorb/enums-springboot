package resources;

import model.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.OrderRepository;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderRepository repository;

    @GetMapping
    public ResponseEntity<Object> findAll(){
        List<Order> list = repository.findAll();
        return ResponseEntity.ok().body(list);
    }
}