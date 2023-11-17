package com.devjoaosilveira.dslist.services;

import com.devjoaosilveira.dslist.dto.GameListDTO;
import com.devjoaosilveira.dslist.entities.Game;
import com.devjoaosilveira.dslist.entities.GameList;
import com.devjoaosilveira.dslist.projections.GameMinProjection;
import com.devjoaosilveira.dslist.repositories.GameListRepository;
import com.devjoaosilveira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        var dto = result.stream().map(GameListDTO::new).toList();
        return dto;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        var obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }


}
