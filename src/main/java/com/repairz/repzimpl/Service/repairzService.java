package com.repairz.repzimpl.Service;

import com.repairz.repzimpl.DAO.OrderDao;
//import com.repairz.repzimpl.DAO.OrderDaoImpl;
import com.repairz.repzimpl.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class repairzService {
    private OrderDao obj;
    @Autowired
    repairzService(@Qualifier("fake") OrderDao obj)
    {
        this.obj=obj;
    }
    public int registerOrder(UUID order_id, Order order) {
        obj.registerOrder(order_id,order);
        return 1;
    }

    public int updateOrder(UUID order_id,Order order) {
        obj.updateOrder(order_id,order);
        return 1;
    }


    public int deleteOrder(UUID order_id) {
       obj.deleteOrder(order_id);
        return 0;
    }

    public Order getOrder(UUID order_id) {
        Order order=obj.getOrder(order_id);
        return order;
    }

    public ArrayList<Order> getOrders() {
        ArrayList list=obj.getOrders();
        return list;
    }
}
