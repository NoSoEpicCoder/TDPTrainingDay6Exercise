package com.accenture.service;

import com.accenture.modules.Book;
import com.accenture.modules.CD;
import com.accenture.modules.Item;
import com.accenture.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Iterable<Item> getAll(){
        return itemRepository.findAll();
    }

    public List<Item> getAllByType(String type){
        return itemRepository.findAllByType(type.toUpperCase());
    }

    public Item getItem(Integer id){
        return itemRepository.findById(id).orElse(null);
    }

    public void save(Item item){
        itemRepository.save(item);
    }

    public void delete(Item item){
        itemRepository.delete(item);
    }
}
