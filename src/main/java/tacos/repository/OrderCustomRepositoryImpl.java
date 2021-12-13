package tacos.repository;

import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import tacos.repository.entity.Order;
import tacos.repository.entity.QOrder;

import java.util.List;

@Repository
public class OrderCustomRepositoryImpl extends QuerydslRepositorySupport implements  OrderCustomRepository{
    public OrderCustomRepositoryImpl(){
        super(Order.class);
    }

    @Override
    public List<Order> getOrderFromdeliveryCity(String deliveryCity) {

        JPQLQuery<Order> query =
                from(QOrder.order)
                        .select(
                                QOrder.order
                        )
                        .where(QOrder.order.deliveryCity.eq(deliveryCity));

        /*JPQLQuery<DeliveryInfo> query =
                from(QOrder.order)
                        .select(
                                new QDeliveryInfo(
                                        QOrder.order.deliveryName,
                                        QOrder.order.deliveryStreet,
                                        QOrder.order.deliveryState)
                        )
                        .where(QOrder.order.deliveryCity.eq(deliveryCity));*/

       return query.fetch();
    }
}
