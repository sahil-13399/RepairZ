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
        obj.registerOrder(UUID.randomUUID(),order);
    }
    @GetMapping(path = "/")
    public void geOrders()
    {
        ArrayList<Order> list=obj.getOrders();
    }
}
