package model.entities;

import enums.OrderStatus;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "order")
public final class Order implements Serializable {
    private static final long SerialVersionUID = 1L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;

    private Integer orderStatus;

    public Order() { }

    public Order(Long id, Instant moment, OrderStatus orderStatus) {
        super();
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }
    }
}
