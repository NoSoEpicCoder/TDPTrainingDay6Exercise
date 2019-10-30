package com.accenture.controller;

import com.accenture.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CartController {

    @Autowired
    CartService cartService;

}
