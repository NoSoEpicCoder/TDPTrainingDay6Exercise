package com.accenture.modules;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Cart {

    @GeneratedValue @Id
    private Long id;
    List<Item> cartItems;
    private int numOfItems;

    public void addItemToCart(Item item){
        cartItems.add(item);
    }

    public void removeItemFromCart(Item item){
        cartItems.remove(item);
    }

    public List<Item> getAllCartItems(){
        return cartItems;
    }
}
