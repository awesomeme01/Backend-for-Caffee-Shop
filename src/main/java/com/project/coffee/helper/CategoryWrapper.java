package com.project.coffee.helper;

import com.project.coffee.model.Category;
import com.project.coffee.model.Item;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class CategoryWrapper {
    private Long id;
    private String name;
    private String nameRU;
    private String nameTR;
    private String nameKG;
    private String pictureURL;
    private Set<Category> subCategory;
    private Boolean isSubCategoryStatus;

    private List<Item> items;

    public CategoryWrapper() {
    }

    public CategoryWrapper(Long id, String name, String pictureURL, Set<Category> subCategory, Boolean isSubCategoryStatus, List<Item> items, String nameRU, String nameTR, String nameKG) {
        this.id = id;
        this.name = name;
        this.pictureURL = pictureURL;
        this.subCategory = subCategory;
        this.isSubCategoryStatus = isSubCategoryStatus;
        this.items = items;
        this.nameRU = nameRU;
        this.nameTR = nameTR;
        this.nameKG = nameKG;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public String getNameKG() {
        return nameKG;
    }

    public void setNameKG(String nameKG) {
        this.nameKG = nameKG;
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
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

    public void setNameTR(String nameTR) {
        this.nameTR = nameTR;
    }

    @Override
    public String toString() {
        return "CategoryWrapper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pictureURL='" + pictureURL + '\'' +
                ", subCategory=" + subCategory +
                ", isSubCategoryStatus=" + isSubCategoryStatus +
                ", items=" + items +
                '}';
    }
}
