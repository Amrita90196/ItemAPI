package com.amrita.itemapi.service;

import com.amrita.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();

    public ItemService() {
        items.add(new Item(1, "Laptop", "Electronics item"));
        items.add(new Item(2, "Mobile", "Smartphone device"));
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

}
