package com.accenture.repository;

import com.accenture.modules.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

    List<Item> findAllByType(String type);

}
