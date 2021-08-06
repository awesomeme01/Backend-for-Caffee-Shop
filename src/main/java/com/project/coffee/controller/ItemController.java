package com.project.coffee.controller;

import com.project.coffee.helper.ItemForScript;
import com.project.coffee.model.Category;
import com.project.coffee.model.Item;
import com.project.coffee.service.CategoryService;
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
    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public Item create (@RequestBody Item item) {
        return itemService.create(item);
    }

    @PostMapping("/createFromScript")
    public Item createFromScript(@RequestBody ItemForScript item){
        try{
            Category category = categoryService.findByName(item.getCategory());
            Item item1 = new Item(item.getName(),
                    item.getNameRU(),
                    item.getNameTR(),
                    item.getNameKG(),
                    item.getDescription(),
                    item.getDescriptionRU(),
                    item.getDescriptionTR(),
                    item.getDescriptionKG(),
                    item.getWeight(),
                    item.getPrice(),
                    item.getPictureURL(),
                    category);
            return itemService.create(item1);
        }catch (Exception ex){
            System.out.println(ex);
            return null;

        }
    }

    @GetMapping("/getByCategory/{category}")
    public List <Item> getByCategory(@PathVariable String category) {
        return itemService.getByCategory(category);
    }

    @GetMapping("/getAll")
    public List <Item> getAll() {
        return itemService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Item getById(@PathVariable Long id){
        return itemService.getById(id);
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
