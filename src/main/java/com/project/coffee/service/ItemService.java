package com.project.coffee.service;

import com.project.coffee.model.Category;
import com.project.coffee.model.Item;

import java.util.List;

public interface ItemService {
    Item create (Item item);
    List <Item> getByCategory(String category);
    List <Item> getAll();
    Item update (Item item);
    void deleteItem(Long id);
    Item getById(Long id);
}
