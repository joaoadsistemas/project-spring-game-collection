package com.devjoaosilveira.dslist.controllers;

import com.devjoaosilveira.dslist.dto.GameListDTO;
import com.devjoaosilveira.dslist.dto.GameMinDTO;
import com.devjoaosilveira.dslist.dto.ReplacementDTO;
import com.devjoaosilveira.dslist.services.GameListService;
import com.devjoaosilveira.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameListDTO>> findAll() {
        return ResponseEntity.ok().body(gameListService.findAll());
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable("listId") Long listId) {
        return ResponseEntity.ok().body(gameService.findByList(listId));
    }

    @PostMapping("/{listId}/replacement")
    public ResponseEntity<Void> move(@PathVariable("listId") Long listId, @RequestBody ReplacementDTO body) {

        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

        return ResponseEntity.ok().build();
    }


}
