package com.project.coffee.service;

import com.project.coffee.model.Category;

import java.util.List;

public interface CategoryService {
    Category create (Category category);
    List <Category> getAll();
    Category update (Category category);
    void deleteCategory (Category category);
}
