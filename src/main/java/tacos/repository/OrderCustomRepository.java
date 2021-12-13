package tacos.repository;

import tacos.repository.entity.Order;

import java.util.List;

public interface OrderCustomRepository {
    List<Order> getOrderFromdeliveryCity(String deliveryCity);
}
