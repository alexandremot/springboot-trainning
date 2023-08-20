package com.alexandremot.trainning.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Anime {

    private String anime;

    public Anime(String anime) {
        this.anime = anime;
    }


    public Anime() {
    }
}
