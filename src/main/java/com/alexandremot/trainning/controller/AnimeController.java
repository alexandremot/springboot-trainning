package com.alexandremot.trainning.controller;

import com.alexandremot.trainning.domain.Anime;
import com.alexandremot.trainning.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@AllArgsConstructor
@RequiredArgsConstructor
public class AnimeController {

    @Autowired
    private DateUtil dateUtil;

    Logger logger = LoggerFactory.getLogger(AnimeController.class);

    @GetMapping(path = "lista_animes")
    public List<Anime> list(){
        logger.info(dateUtil.formatLocalDatetimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Saint Seya"), new Anime("Shurato"));
    }

}
