package com.accenture.controller;

import com.accenture.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemListController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/itemlist")
    public String itemlist(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "/itemlist";
    }
}
