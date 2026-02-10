package com.amrita.itemapi.controller;

import com.amrita.itemapi.model.Item;
import com.amrita.itemapi.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/items/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemService.getItemById(id);
    }
    @PostMapping("/items")
    public ResponseEntity<Item> addItem(@RequestBody Item item) {

        // Input validation
        if (item.getName() == null || item.getName().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        Item savedItem = itemService.addItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
    }
}

