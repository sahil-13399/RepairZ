package com.repairz.repzimpl.DAO;

import com.repairz.repzimpl.Model.Order;

import java.util.ArrayList;
import java.util.UUID;

public interface OrderDao {
    int registerOrder(UUID order_id,Order order);
    int updateOrder(UUID order_id,Order order);
    int deleteOrder(UUID order_id);
    Order getOrder(UUID order_id);
    ArrayList<Order> getOrders();
}
