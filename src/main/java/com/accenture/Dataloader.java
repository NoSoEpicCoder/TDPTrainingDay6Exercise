package com.accenture;

import com.accenture.modules.book.Book;
import com.accenture.modules.cd.CD;
import com.accenture.service.BookService;
import com.accenture.service.CDService;
import com.accenture.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

@Component
public class Dataloader {

    @Autowired
    private BookService bookService;

    @Autowired
    private CDService cdService;

    @Autowired
    private ItemService itemService;

    private final File FILE = new File("//CPX-DYTRCC1P6OZ/Users/kevin.gilbert/Documents/IOTest.txt");

    @PostConstruct
    public void loadData(){
        fileReader();
    }

    public void fileReader(){
        String line;
        String[] lineParts;
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(FILE)));
            scanner.nextLine();
            while (scanner.hasNext()){
                line = scanner.nextLine();
                lineParts = line.split("\t");
                //If taking in id with leading zero's use this
                /*if(lineParts[0].matches("\\d+")){
                    for(int i=0; i<lineParts[0].length(); i++){
                        if(lineParts[0].charAt(0) == 0){
                            lineParts[0].substring(1);
                        } else {
                            int bookId = Integer.parseInt(lineParts[0]);
                        }
                    }
                } else {
                    System.out.println("Not proper ID value");
                }*/
                if(lineParts[0].equalsIgnoreCase("book")){
                    Book book = new Book(lineParts[1], lineParts[2], Double.parseDouble(lineParts[3]), lineParts[4]);
                    bookService.save(book);
                } else if(lineParts[0].equalsIgnoreCase("cd")){
                    CD cd = new CD(lineParts[1], lineParts[2], Double.parseDouble(lineParts[3]), lineParts[4]);
                    cdService.save(cd);
                }
            }
            scanner.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
