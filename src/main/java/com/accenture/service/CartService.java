package com.accenture.service;

import com.accenture.modules.Cart;
import com.accenture.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Iterable<Cart> getAllCartItems(){
        return cartRepository.findAll();
    }

    public Cart getCartItem(Integer id){
        return cartRepository.findById(id).orElse(null);
    }

    public void saveCartItem(Cart cartItem){
        cartRepository.save(cartItem);
    }

    public void deleteCartItem(Cart cartItem){
        cartRepository.delete(cartItem);
    }
}
