package com.project.coffee.model;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "picture_URL")
    private String pictureURL;

    @ManyToOne
    @JoinColumn(name = "subCategory")
    private Category subCategory;


    //Constructor
    public Category(String name, String pictureURL) {
        this.name = name;
        this.pictureURL = pictureURL;
    }

    public Category() {
    }

    //Getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    //Setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
}
