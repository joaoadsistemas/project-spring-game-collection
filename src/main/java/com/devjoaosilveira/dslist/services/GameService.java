package com.devjoaosilveira.dslist.services;

import com.devjoaosilveira.dslist.dto.GameMinDTO;
import com.devjoaosilveira.dslist.entities.Game;
import com.devjoaosilveira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        // transform List<Game> in List<GameMinDTO>
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }


}
