package com.devjoaosilveira.dslist.dto;

import com.devjoaosilveira.dslist.entities.Game;
import com.devjoaosilveira.dslist.projections.GameMinProjection;
import org.springframework.beans.BeanUtils;

public class GameMinDTO {


    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {

    }

    public GameMinDTO(Game entity) {
        // Copy all properties entity(Game) for this(GameMinDTO), if the same name properties is equals
        // (NEED GETTERS AND SETTERS, NO ONLY GETTER)
        BeanUtils.copyProperties(entity,this);
    }

    public GameMinDTO(GameMinProjection projection) {
        // Copy all properties projection(GameMinProjection) for this(GameMinDTO), if the same name properties is equals
        // (NEED GETTERS AND SETTERS, NO ONLY GETTER)
        BeanUtils.copyProperties(projection,this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
