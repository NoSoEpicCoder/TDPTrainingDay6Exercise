package com.accenture.modules.cart;

import com.accenture.modules.item.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.LinkedList;

@Entity
public class ShoppingCart {

    @GeneratedValue @Id
    private Long id;
    LinkedList<Item> cartItems = new LinkedList<>();
    private int numOfItems;

    public void addItemToCart(Item item){
        cartItems.add(item);
    }

    public void removeItemFromCart(Item item){
        cartItems.remove(item);
    }

    public LinkedList<Item> getAllCartItems(){
        return cartItems;
    }
}
