package com.alexandremot.trainning.service;

import com.alexandremot.trainning.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Saint Seya"), new Anime(2L, "Yu Yu Hakusho"));
    }
}
