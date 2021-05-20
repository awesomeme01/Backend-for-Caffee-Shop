//package com.project.coffee.controller;
//
//import com.project.coffee.model.Order;
//import com.project.coffee.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@CrossOrigin("*")
//@RequestMapping("order")
//public class OrderController {
//    @Autowired
//    OrderService orderService;
//
//    @GetMapping("/getAll")
//    public Set<Order> getAll(){
//        return orderService.getOrders();
//    }
//
//    @PostMapping("/create")
//    public Order create(@RequestBody Order order){
//        return orderService.create(order);
//    }
//
//    @GetMapping("/getById/{id}")
//    public Order getById(@PathVariable Long id){
//        return orderService.getOrderById(id);
//    }
//
//    @PutMapping("/update")
//    public Order update(@RequestBody Order order){
//        return orderService.update(order);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String delete(@PathVariable Long id){
//        orderService.delete(id);
//        return "Successfully deleted!";
//    }
//}
