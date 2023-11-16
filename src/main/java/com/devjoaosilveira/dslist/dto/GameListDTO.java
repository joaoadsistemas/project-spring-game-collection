package com.devjoaosilveira.dslist.dto;

import com.devjoaosilveira.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private Long id;
    private String name;


    public GameListDTO() {

    }

    public GameListDTO(GameList entity) {
        // Copy all properties entity(GameList) for this(GameListDTO), if the same name properties is equals
        // (NEED GETTERS AND SETTERS, NO ONLY GETTER)
        BeanUtils.copyProperties(entity,this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
