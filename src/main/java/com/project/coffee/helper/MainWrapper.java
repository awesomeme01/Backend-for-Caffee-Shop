package com.project.coffee.helper;

import com.project.coffee.model.Category;
import com.project.coffee.model.Item;

import java.util.List;

public class MainWrapper {
    private List<CategoryWrapper> allCategories;

    public MainWrapper() {
    }

    public MainWrapper(List<CategoryWrapper> allCategories) {
        this.allCategories = allCategories;
    }

    public List<CategoryWrapper> getAllCategories() {
        return allCategories;
    }

    public void setAllCategories(List<CategoryWrapper> allCategories) {
        this.allCategories = allCategories;
    }
}
