package com.project.coffee.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JoinColumn(name = "subCategory")
    private Set<Category> subCategory;

    @Column(name = "isSubCategoryStatus")
    private Boolean isSubCategoryStatus;


    //Constructor
    public Category(String name, String pictureURL) {
        this.name = name;
        this.pictureURL = pictureURL;
    }

    public Category() {
        this.setSubCategoryStatus(false);
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


    public Set<Category> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Set<Category> subCategory) {
        this.subCategory = subCategory;
    }

    public Boolean getSubCategoryStatus() {
        return isSubCategoryStatus;
    }

    public void setSubCategoryStatus(Boolean subCategoryStatus) {
        isSubCategoryStatus = subCategoryStatus;
    }
    public void addSubCategory(Category category){
        this.subCategory.add(category);
    }
}
