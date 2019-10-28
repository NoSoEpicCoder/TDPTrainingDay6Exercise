package com.accenture.service;

import com.accenture.modules.item.Item;
import com.accenture.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Iterable<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item getItem(Long id){
        return itemRepository.findById(id).orElse(null);
    }

    public void save(Item item){
        itemRepository.save(item);
    }

    public void delete(Item item){
        itemRepository.delete(item);
    }
}
