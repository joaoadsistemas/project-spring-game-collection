package com.devjoaosilveira.dslist.services;

import com.devjoaosilveira.dslist.dto.GameDTO;
import com.devjoaosilveira.dslist.dto.GameMinDTO;
import com.devjoaosilveira.dslist.entities.Game;
import com.devjoaosilveira.dslist.projections.GameMinProjection;
import com.devjoaosilveira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        // transform List<Game> in List<GameMinDTO>
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }

    // User import from spring, not jakarta
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        var dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        // transform List<Game> in List<GameMinDTO>
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }



}
