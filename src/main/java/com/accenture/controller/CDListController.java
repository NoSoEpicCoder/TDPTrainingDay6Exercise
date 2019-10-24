package com.accenture.controller;

import com.accenture.service.CDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CDListController {

    @Autowired
    CDService cdService;

    @RequestMapping(value = "/cdlist")
    public String cdlist(Model model) {
        model.addAttribute("cds", cdService.getAllCDs());
        return "/cdlist";
    }
}