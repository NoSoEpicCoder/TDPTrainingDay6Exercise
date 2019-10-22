package com.accenture.controller;

import com.accenture.cd.CDCatalog;
import com.accenture.cd.FreeCD;
import com.accenture.cd.PayCD;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CDListController {

    @RequestMapping(value = "/cdlist")
    public String cdlist(Model model) {

        FreeCD freeCD = new FreeCD("Soy Boys", "Soft Metal", "Like hard metal but soft");
        PayCD payCD = new PayCD("The caveman", "Ancient music", "Back in my day we used to...", 50.00);

        CDCatalog cdCatalog = new CDCatalog();
        cdCatalog.addCD(freeCD);
        cdCatalog.addCD(payCD);

        model.addAttribute("cds", cdCatalog.getAllCDs());

        return "cdlist";
    }
}
