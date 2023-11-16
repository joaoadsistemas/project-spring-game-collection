package com.devjoaosilveira.dslist.services;

import com.devjoaosilveira.dslist.dto.GameListDTO;
import com.devjoaosilveira.dslist.entities.Game;
import com.devjoaosilveira.dslist.entities.GameList;
import com.devjoaosilveira.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        var dto = result.stream().map(GameListDTO::new).toList();
        return dto;
    }




}
