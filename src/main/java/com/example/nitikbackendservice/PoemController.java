package com.example.nitikbackendservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PoemController {
    private PoemRepository poemRepository;

    @Autowired
    public PoemController(PoemRepository poemRepository){
        this.poemRepository = poemRepository;
    }
    @RequestMapping("/poems")
    List<Poem> getAll(){
        return poemRepository.findAll();
    }

}
