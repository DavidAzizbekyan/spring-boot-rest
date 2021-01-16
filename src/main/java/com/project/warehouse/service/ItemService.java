package com.project.warehouse.service;

import com.project.warehouse.entity.Item;
import com.project.warehouse.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    public Item getById(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        if (item.isPresent())
            return item.get();
        throw new ResourceNotFoundException("Item doesnt exists");
    }

    public Item deleteById(Long id) {
        Item item = getById(id);
        itemRepository.deleteById(id);
        return item;
    }

    public Item updateById(Long id, Item newItem) {
        Item item = getById(id);
        item.setName(newItem.getName());
        item.setAmount(newItem.getAmount());
        itemRepository.save(item);
        return getById(id);
    }

    public Item add(Item item) {
        return itemRepository.save(item);

    }

    public List<Item> addMany(List<Item> items) {
        return itemRepository.saveAll(items);

    }

    public Item getByName(String name) {
        return itemRepository.findByName(name);
    }

    public Integer getAmountByName(String name) {
        return itemRepository.findItemAmountByName(name);
    }

    public List<Item> getAllByAmount(Integer amount) {
        return itemRepository.getAllByAmount(amount);
    }
}
