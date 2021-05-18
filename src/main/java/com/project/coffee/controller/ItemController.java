package com.project.coffee.controller;

import com.project.coffee.model.Category;
import com.project.coffee.model.Item;
import com.project.coffee.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    public Item create (@RequestBody Item item) {
        return itemService.create(item);
    }

    @GetMapping("/getByCategory/{category}")
    public List <Item> getByCategory(@PathVariable String category) {
        return itemService.getByCategory(category);
    }

    @GetMapping("/getAll")
    public List <Item> getAll() {
        return itemService.getAll();
    }

    @PutMapping("/update")
    public Item update (@RequestBody Item item) {
        return itemService.update(item);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }
}
