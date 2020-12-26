package com.repairz.repzimpl.Controller;

import com.repairz.repzimpl.Model.Order;
import com.repairz.repzimpl.Service.repairzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/orders")
public class RepairZController {
    private repairzService obj;
    @Autowired
    public RepairZController(repairzService obj) {
        this.obj = obj;
    }
    @PostMapping(path = "/addOrder")
    public void addOrders(@RequestBody Order order)
    {   //UUID order_id=new UUID();
        UUID order_id=UUID.randomUUID();
        order.setOrder_id(order_id);
        System.out.println(order.toString());
        obj.registerOrder(order_id,order);
    }
    @GetMapping(path = "/")
    public ArrayList<Order> getOrders()
    {
        ArrayList<Order> list=obj.getOrders();
        return list;
    }
    @GetMapping(path = "/{order_id}")
    public Order getOrder(@PathVariable("order_id") UUID order_id){
        return obj.getOrder(order_id);
    }
    @PutMapping(path = "/updateOrder/{order_id}")
    public void updateOrder(@PathVariable("order_id") UUID order_id,@RequestBody Order order)
        {
            order.setOrder_id(order_id);
            obj.updateOrder(order_id,order);
        }
    @DeleteMapping(path="/deleteOrder/{order_id}")
    public void deleteOrder(@PathVariable("order_id") UUID order_id)
        {
            obj.deleteOrder(order_id);
        }
}
