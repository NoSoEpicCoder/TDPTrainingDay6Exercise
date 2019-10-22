package com.accenture.cd;

import java.util.LinkedList;

public class CDCatalog {

    private LinkedList<CD> allCDs = new LinkedList();

    public void addCD(CD cd){
        allCDs.add(cd);
    }

    public void remove(CD cd){
        allCDs.remove(cd);
    }

    public void update(CD cd){
        allCDs.remove(cd.getId());
        allCDs.add(cd);
    }

    public LinkedList<CD> getAllCDs(){
        return allCDs;
    }

    public LinkedList<CD> sort(String sortMethod){
        LinkedList<CD> sortedList = new LinkedList();
        //need to implement logic
        return sortedList;
    }

    public LinkedList<CD> search(String token, String searchType){
        LinkedList<CD> cdsFound = new LinkedList();
        if(token == null){
            System.out.println("Please provide a search input");
        }
        for(CD cd : allCDs){
            if (searchType.equalsIgnoreCase(CD.SEARCH_NAME)){
                if (token.equalsIgnoreCase(cd.getName())){
                    cdsFound.add(cd);
                } else if (searchType.equalsIgnoreCase(CD.SEARCH_GENRE)){
                    if (token.equalsIgnoreCase(cd.getGenre())){
                        cdsFound.add(cd);
                    } else if (searchType.equalsIgnoreCase(CD.SEARCH_DESCRIPTION)){
                        if (token.equalsIgnoreCase(cd.getDescription())){
                            cdsFound.add(cd);
                        }
                    }
                }
            }
        }
        return cdsFound;
    }
}
