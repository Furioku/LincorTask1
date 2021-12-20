package com.task.LincorTask1.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/item")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getItem() {
        return itemService.getItem ();
    }

    @PostMapping
    public void addNewItem(@RequestBody Item item){
        itemService.addItem(item);
    }

}