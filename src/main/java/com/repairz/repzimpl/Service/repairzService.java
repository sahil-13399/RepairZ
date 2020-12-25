package com.repairz.repzimpl.Service;

import com.repairz.repzimpl.DAO.OrderDao;
import com.repairz.repzimpl.DAO.OrderDaoImpl;
import com.repairz.repzimpl.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class repairzService {
    OrderDao obj;
    @Autowired
    repairzService(OrderDao obj)
    {
        this.obj=obj;
    }
    public int registerOrder(UUID order_id, Order order) {

        return 1;
    }

    public int updateOrder(UUID order_id,Order order) {

        return 1;
    }


    public int deleteOrder(UUID order_id) {
        map.remove(order_id);
        return 0;
    }

    public Order getOrder(UUID order_id) {
        return null;
    }

    public List<Order> getOrders() {
        ArrayList<Order> list=new ArrayList<>();
        for(UUID x:map.keySet())
        {
            list.add(map.get(x));
        }
        return list;
    }
}
