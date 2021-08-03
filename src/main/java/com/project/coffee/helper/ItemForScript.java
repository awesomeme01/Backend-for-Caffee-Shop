package com.project.coffee.helper;

import com.project.coffee.model.Category;

public class ItemForScript {
    private String name;
    private String nameRU;
    private String nameTR;
    private String nameKG;
    private String description;
    private String descriptionRU;
    private String descriptionTR;
    private String descriptionKG;
    private String weight;
    private Double price;
    private String pictureURL;
    private String category;

    public ItemForScript() {
    }

    public ItemForScript(String name, String nameRU, String nameTR, String nameKG, String description, String descriptionRU, String descriptionTR, String descriptionKG, String weight, Double price, String pictureURL, String category) {
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
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNameKG() {
        return nameKG;
    }

    public void setNameKG(String nameKG) {
        this.nameKG = nameKG;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getDescriptionKG() {
        return descriptionKG;
    }

    public void setDescriptionKG(String descriptionKG) {
        this.descriptionKG = descriptionKG;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
