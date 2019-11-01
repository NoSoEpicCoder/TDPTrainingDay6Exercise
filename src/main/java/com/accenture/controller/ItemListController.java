package com.accenture.controller;

import com.accenture.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemListController {

    @Autowired
    ItemService itemService;

//    @Autowired
//    ShoppingCart cart;

    @RequestMapping(path = "/itemlist", method = RequestMethod.GET)
    public String itemlist(Model model) {
        model.addAttribute("items", itemService.getAll());
        return "/itemlist";
    }

    /*@RequestMapping(method = RequestMethod.GET, value = "/cartview"){
        public void buyItem(@RequestBody Item item){
            cart.addItemToCart(item);
        }
    }*/
}
