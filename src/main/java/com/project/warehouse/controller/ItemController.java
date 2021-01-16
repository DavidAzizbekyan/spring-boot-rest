package com.project.warehouse.controller;

import com.project.warehouse.entity.Item;
import com.project.warehouse.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("items/")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("add")
    public Item add(@RequestBody Item item) {
        return itemService.add(item);
    }

    @PostMapping("addMany")
    public List<Item> addMany(@RequestBody List<Item> items) {
        return itemService.addMany(items);
    }

    @GetMapping("getAll")
    public List<Item> getAll() {
        return itemService.getAll();
    }

    @GetMapping("getByName/{name}")
    public Item getByName(@PathVariable String name) {
        return itemService.getByName(name);
    }

    @GetMapping("getById/{id}")
    public Item getById(@PathVariable Long id) {
        return itemService.getById(id);
    }

    @PutMapping("updateById/{id}")
    public Item updateById(@PathVariable Long id, @RequestBody Item item) {
        return itemService.updateById(id, item);

    }

    @DeleteMapping("deleteById/{id}")
    public Item deleteById(@PathVariable Long id) {
        return itemService.deleteById(id);
    }

    @GetMapping("getAmountByName/{name}")
    public Integer getAmountByName(@PathVariable String name) {
        return itemService.getAmountByName(name);
    }

    @GetMapping("getAllByAmount/{amount}")
    public List<Item> getAllByAmount(@PathVariable Integer amount) {
        return itemService.getAllByAmount(amount);
    }
}

