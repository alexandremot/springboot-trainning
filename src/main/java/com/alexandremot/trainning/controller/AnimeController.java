package com.alexandremot.trainning.controller;

import com.alexandremot.trainning.domain.Anime;
import com.alexandremot.trainning.service.AnimeService;
import com.alexandremot.trainning.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("animes")
@RequiredArgsConstructor
public class AnimeController {

    private final AnimeService animeService;


    private final DateUtil dateUtil;

    Logger logger = LoggerFactory.getLogger(AnimeController.class);

    @GetMapping
    public List<Anime> listaAnimes(){
        logger.info(dateUtil.formatLocalDatetimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }

}
