package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchItemController {

    @RequestMapping(path = "/searchlist", method = RequestMethod.GET)
    public String searchlist(Model model) {

        //model.addAttribute("searchitems", itemCatalog.getAllItems());

        return "searchlist";
    }
}
