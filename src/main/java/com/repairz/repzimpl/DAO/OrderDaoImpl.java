package com.repairz.repzimpl.DAO;

import com.repairz.repzimpl.Model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.UUID;

@Repository
public class OrderDaoImpl implements OrderDao{
    private final HashMap<UUID,Order> map;
    OrderDaoImpl(){
        map=new HashMap<>();
    }
    @Override
    public int registerOrder(UUID order_id,Order order) {
        if(map.containsKey(order_id))
        {
            return -1;
        }
        map.putIfAbsent(order_id,order);
    return 1;
    }

    @Override
    public int updateOrder(UUID order_id,Order order) {
        map.put(order_id,order);
        return 1;
    }

    @Override
    public int deleteOrder(UUID order_id) {
        map.remove(order_id);
        return 0;
    }

    @Override
    public Order getOrder(UUID order_id) {
        Order order = null;
        if(map.containsKey(order_id)) {
            order = map.get(order_id);
        }
        return order;
    }

    @Override
    public ArrayList<Order> getOrders() {
        ArrayList<Order> list=new ArrayList<>();
        for(UUID x:map.keySet())
        {
            System.out.println(map.get(x).toString());
            list.add(map.get(x));
        }
        return list;
    }
}
