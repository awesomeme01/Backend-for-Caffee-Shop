package com.project.coffee.controller;

import com.project.coffee.model.Category;
import com.project.coffee.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }
    @GetMapping("/getAll")
    public List <Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping("/update")
    public Category update (@RequestBody Category category) {
        return categoryService.update(category);
    }

    @DeleteMapping("/delete")
    public void deleteCategory (@RequestBody Category category) {
        categoryService.deleteCategory(category);
    }
}
