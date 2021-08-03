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
    @Column(name = "name_ru")
    private String nameRU;
    @Column(name = "name_tr")
    private String nameTR;
    @Column(name = "name_kg")
    private String nameKG;
    @Column(name = "description")
    private String description;
    @Column(name = "description_ru")
    private String descriptionRU;
    @Column(name = "description_tr")
    private String descriptionTR;
    @Column(name = "description_kg")
    private String descriptionKG;
    @Column(name = "weight")
    private String weight;
    @Column(name = "price")
    private Double price;
    @Column(name = "picture_URL")
    private String pictureURL;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "category_id")
    private Category categoryName;

    @Column(name = "discount")
    private Double discount;

    //Constructor
    public Item(String name, String description, String weight, Double price, String pictureURL, Category category, Double discount) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.pictureURL = pictureURL;
        this.categoryName = category;
        this.discount = discount;
    }

    public Item(String name, String nameRU, String nameTR, String nameKG, String description, String descriptionRU, String descriptionTR, String descriptionKG, String weight, Double price, String pictureURL, Category category) {
        this.name = name;
        this.nameRU = nameRU;
        this.nameTR = nameTR;
        this.nameKG = nameKG;
        this.description = description;
        this.descriptionRU = descriptionRU;
        this.descriptionTR = descriptionTR;
        this.descriptionKG = descriptionKG;
        this.weight = weight;
        this.price = price;
        this.pictureURL = pictureURL;
        this.categoryName = category;
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
        return categoryName;
    }

    public Double getDiscount() {
        return discount;
    }

    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptionKG() {
        return descriptionKG;
    }

    public void setDescriptionKG(String descriptionKG) {
        this.descriptionKG = descriptionKG;
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
        this.categoryName = category;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getNameRU() {
        return nameRU;
    }

    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }


    public String getNameTR() {
        return nameTR;
    }

    public String getNameKG() {
        return nameKG;
    }

    public void setNameKG(String nameKG) {
        this.nameKG = nameKG;
    }

    public void setNameTR(String nameTR) {
        this.nameTR = nameTR;
    }

    public String getDescriptionRU() {
        return descriptionRU;
    }

    public void setDescriptionRU(String descriptionRU) {
        this.descriptionRU = descriptionRU;
    }

    public String getDescriptionTR() {
        return descriptionTR;
    }

    public void setDescriptionTR(String descriptionTR) {
        this.descriptionTR = descriptionTR;
    }
}
