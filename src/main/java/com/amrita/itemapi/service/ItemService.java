package com.amrita.itemapi.service;

import com.amrita.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private int counter = 1; // ID generator

    public ItemService() {
        items.add(new Item(counter++, "Laptop", "Electronics item"));
        items.add(new Item(counter++, "Mobile", "Smartphone device"));
    }

    public List<Item> getAllItems() {
        return items;
    }

    public Item getItemById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    // ✅ ONLY ONE addItem method
    public Item addItem(Item item) {
        item.setId(counter++);
        items.add(item);
        return item;
    }
}

