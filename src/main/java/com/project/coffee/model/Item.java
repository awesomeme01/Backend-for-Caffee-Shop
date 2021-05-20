package com.project.coffee.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "weight")
    private String weight;
    @Column(name = "price")
    private Double price;
    @Column(name = "picture_URL")
    private String pictureURL;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)

    private Category category;
    @Column(name = "discount")
    private Double discount;

    //Constructor
    public Item(String name, String description, String weight, Double price, String pictureURL, Category category, Double discount) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.pictureURL = pictureURL;
        this.category = category;
        this.discount = discount;
    }
    public Item() {
    }

    //Getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public Category getCategory() {
        return category;
    }

    public Double getDiscount() {
        return discount;
    }

    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
