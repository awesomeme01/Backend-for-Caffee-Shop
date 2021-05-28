package com.project.coffee.controller;

import com.project.coffee.helper.CategoryWrapper;
import com.project.coffee.helper.MainWrapper;
import com.project.coffee.model.Category;
import com.project.coffee.service.CategoryService;
import com.project.coffee.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/main")
public class MainController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    ItemService itemService;

    @GetMapping("/getUpdate")
    public List<CategoryWrapper> getUpdate(){
        List<Category> allCategories = categoryService.getAll();
        List<CategoryWrapper> categoryWrappers = new ArrayList<>();
        for(Category c: allCategories){
            categoryWrappers.add(new CategoryWrapper(c.getId(),c.getName(),c.getPictureURL(),c.getSubCategory(),c.getSubCategoryStatus(),itemService.getByCategory(c.getName())));
        }

        return categoryWrappers;
    }
}
