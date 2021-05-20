//package com.project.coffee.model;
//
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.Set;
//
//@Entity
//@Table(name = "order")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @OneToMany
//    @OnDelete(action = OnDeleteAction.CASCADE
//    )
//    @JoinColumn(name = "order_id")
//    private Set<Item> items;
//
//    @Column(name = "total")
//    private Double total;
//
//    @Column(name = "dateTime")
//    private LocalDateTime dateTime;
//
//    public Order() {
//        total = 0.0;
//        dateTime = LocalDateTime.now().plusHours(6);
//    }
//
//    public LocalDateTime getDateTime() {
//        return dateTime;
//    }
//
//    public void setDateTime(LocalDateTime dateTime) {
//        this.dateTime = dateTime;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Set<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(Set<Item> items) {
//        this.items = items;
//    }
//
//    public Double getTotal() {
//        return total;
//    }
//
//    public void setTotal(Double total) {
//        this.total = total;
//    }
//}
