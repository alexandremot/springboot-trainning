package com.alexandremot.trainning.controller;

import com.alexandremot.trainning.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimeController {

    @GetMapping(path = "lista_animes")
    public List<Anime> list(){
        return List.of(new Anime("Saint Seya"), new Anime("Shurato"));
    }

}
