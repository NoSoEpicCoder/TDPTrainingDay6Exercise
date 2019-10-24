package com.accenture.service;

import com.accenture.modules.item.Item;
import com.accenture.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService {

    @Autowired
    BookService bookService;

    @Autowired
    CDService cdService;

    @Autowired
    ItemRepository itemRepository;

    public Iterable<Item> getAllItems(){
        ArrayList<Item> items = new ArrayList<>();
        //items.add(bookService.getAllBooks());
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
