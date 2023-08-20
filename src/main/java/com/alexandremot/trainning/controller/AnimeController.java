package com.alexandremot.trainning.controller;

import com.alexandremot.trainning.domain.Anime;
import com.alexandremot.trainning.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;


@RestController
public class AnimeController {

    @Autowired
    private DateUtil dateUtil;

    Logger logger = LoggerFactory.getLogger(AnimeController.class);

    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping(path = "lista_animes")
    public List<Anime> listaAnimes(){
        logger.info(dateUtil.formatLocalDatetimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Saint Seya"), new Anime("Yu Yu Hakusho"));
    }

}
