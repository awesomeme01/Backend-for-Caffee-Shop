//package com.project.coffee.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "news_1")
//public class News {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "description")
//    private String description;
//
//    @ManyToOne
//    @JoinColumn(name = "item_id_hui")
//    private Item item;
//
//    public News() {
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
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }
//}
