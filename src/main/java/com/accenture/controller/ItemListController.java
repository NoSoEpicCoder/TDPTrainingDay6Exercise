package com.accenture.controller;

import com.accenture.book.FreeBook;
import com.accenture.book.PayBook;
import com.accenture.book.SchoolBook;
import com.accenture.cd.FreeCD;
import com.accenture.cd.PayCD;
import com.accenture.item.ItemCatalog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemListController {

    @RequestMapping(value = "/itemlist")
    public String itemlist(Model model) {

        SchoolBook schoolBook = new SchoolBook("Java for beginners", "Its a long book", 20.00, 5);
        FreeBook freeBook = new FreeBook("Java for noobs", "Get rekt by Java kid");
        PayBook payBook = new PayBook("Python is king", "Become a god", 35.00);
        FreeCD freeCD = new FreeCD("Soy Boys", "Soft Metal", "Like hard metal but soft");
        PayCD payCD = new PayCD("The caveman", "Ancient music", "Back in my day we used to...", 50.00);

        ItemCatalog itemCatalog = new ItemCatalog();
        itemCatalog.addItem(schoolBook);
        itemCatalog.addItem(freeBook);
        itemCatalog.addItem(payBook);
        itemCatalog.addItem(freeCD);
        itemCatalog.addItem(payCD);

        model.addAttribute("items", itemCatalog.getAllItems());

        return "itemlist";
    }
}
