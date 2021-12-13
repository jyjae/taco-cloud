package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.repository.entity.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long>, OrderCustomRepository {
    List<Order> findByDeliveryZip(String deliveryZip);

    //@Query("select od from Order od where od.deliveryZip = :deliverZip")
    //List<Order> getFromDelivery(@Param("deliverZip") String deliverZip);

}