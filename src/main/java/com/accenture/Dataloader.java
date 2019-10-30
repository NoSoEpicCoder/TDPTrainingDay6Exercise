package com.accenture;

import com.accenture.modules.Book;
import com.accenture.modules.CD;
import com.accenture.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.io.*;

@Component
public class Dataloader {

    @Autowired
    private ItemService itemService;

    @Value("classpath:assets/IOTest.txt")
    private Resource resource;

    @PostConstruct
    public void loadData(){
        fileReader();
    }

    private void fileReader(){
        String line;
        String[] lineParts;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                lineParts = line.split("\t");
                if(lineParts[0].equalsIgnoreCase("book")){
                    Book book = new Book(Integer.parseInt(lineParts[1]), lineParts[2], lineParts[3], Double.parseDouble(lineParts[4]), lineParts[5], lineParts[6]);
                    itemService.save(book);
                } else if(lineParts[0].equalsIgnoreCase("cd")){
                    CD cd = new CD(Integer.parseInt(lineParts[1]), lineParts[2], lineParts[3], Double.parseDouble(lineParts[4]), lineParts[5]);
                    itemService.save(cd);
                }
            }
            bufferedReader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
