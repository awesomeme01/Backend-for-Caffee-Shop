package com.project.coffee;
import com.project.coffee.model.Category;
import com.project.coffee.model.Item;
import com.project.coffee.service.CategoryService;
import com.project.coffee.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MainBootstrap implements ApplicationRunner {
    @Autowired
    ItemService itemService;
    @Autowired
    CategoryService categoryService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Category c1 = new Category("Soups", "picureURL");
        Category c2 = new Category("Fast food", "picureURL");
        Category c3 = new Category("Breakfast", "picureURL");
        Category c4 = new Category("Pizza", "picureURL");
        Category c5 = new Category("Drinks", "picureURL");
        categoryService.create(c2);
        categoryService.create(c3);
        categoryService.create(c4);
        categoryService.create(c5);
        categoryService.create(c1);

        itemService.create(new Item("Burger", "Burger with cheese","300 grams", 400.0d,"picureURL", c2, 0.0));
        itemService.create(new Item("Chechevica", "Light soup for dinner","400ml5", 140.0d,"picureURL", c1, 0.0));
        itemService.create(new Item("Margaritta", "Margaritta with cheese","500 grams", 800.0d,"picureURL", c4, 100.0));
        itemService.create(new Item("CocaCola", "0.5l bottle","0.5l", 100.0d,"picureURL", c5, 23.0));
        itemService.create(new Item("Salmon", "Salmon fish","300 grams", 1000.0d,"picureURL", c3, 140.0));

    }
}
