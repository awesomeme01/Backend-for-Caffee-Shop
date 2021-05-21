package com.project.coffee.controller;

import com.project.coffee.model.Category;
import com.project.coffee.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
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

    @GetMapping("/getById/{id}")
    public Category getById(@PathVariable Long id) {
        return categoryService.getById(id);
    }


    @PostMapping("/update")
    public Category update (@RequestBody Category category) {
        return categoryService.update(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory (@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

    @PostMapping("/setSubCategory/{parentId}/{childId}")
    public Category setSubCategory(@PathVariable Long parentId, @PathVariable Long childId){
        Category parent = categoryService.getById(parentId);
        Category child = categoryService.getById(childId);
        if(parent!=null){
            if(!parent.getSubCategoryStatus()){
                parent.setSubCategory(child);
                child.setSubCategoryStatus(true);
            }
        }


        return categoryService.update(parent);
    }

}
