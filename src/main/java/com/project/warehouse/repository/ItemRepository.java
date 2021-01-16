package com.project.warehouse.repository;

import com.project.warehouse.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByName(String name);

    @Query(value = "SELECT item.amount FROM item WHERE item.name=?1", nativeQuery = true)
    Integer findItemAmountByName(String name);

    List<Item> getAllByAmount(Integer amount);
}
