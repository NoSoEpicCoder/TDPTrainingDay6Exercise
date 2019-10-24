package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchItemController {

    @RequestMapping(value = "/searchlist")
    public String searchlist(Model model) {

        //model.addAttribute("searchitems", itemCatalog.getAllItems());

        return "searchlist";
    }
}
