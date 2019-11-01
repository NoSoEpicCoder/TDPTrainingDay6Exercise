package com.accenture.controller;

import com.accenture.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CDListController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(path = "/cdlist", method = RequestMethod.GET)
    public String cdlist(Model model) {
        model.addAttribute("cds", itemService.getAllByType("cd"));
        return "/cdlist";
    }
}