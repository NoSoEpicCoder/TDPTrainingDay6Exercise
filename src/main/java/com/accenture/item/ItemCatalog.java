package com.accenture.item;

import java.util.LinkedList;

public class ItemCatalog {

    LinkedList<Item> allItems = new LinkedList();

    public void addItem(Item item){
        allItems.add(item);
    }

    public void removeItem(Item item) { allItems.remove(item); }

    public LinkedList<Item> getAllItems(){
        return allItems;
    }
}
