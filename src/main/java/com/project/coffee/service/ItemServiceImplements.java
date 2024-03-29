package com.project.coffee.service;

import com.project.coffee.model.Category;
import com.project.coffee.model.Item;
import com.project.coffee.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImplements implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item create(Item item) {
        List<Item> items = itemRepository.findAll();
        for(Item i : items){
            if(i.getName().equals(item.getName())){
                item.setId(i.getId());
            }
        }
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getByCategory(String category) {
        return itemRepository.findAll().stream().filter(x -> {
            if(x.getCategory().getName() != null && category!=null){
                return x.getCategory().getName().equals(category);
            }
            return false;
        }).collect(Collectors.toList());
    }

    @Override
    public Item getById(Long id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
