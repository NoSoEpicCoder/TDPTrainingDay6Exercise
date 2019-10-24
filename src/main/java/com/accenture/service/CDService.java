package com.accenture.service;

import com.accenture.modules.cd.CD;
import com.accenture.repository.CDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CDService {

    @Autowired
    private CDRepository cdRepository;

    public Iterable<CD> getAllCDs(){
        return cdRepository.findAll();
    }

    public CD getCD(Long id){
        return cdRepository.findById(id).orElse(null);
    }

    public void save(CD cd){
        cdRepository.save(cd);
    }

    public void delete(CD cd){
        cdRepository.delete(cd);
    }
}
