package com.devjoaosilveira.dslist.controllers;

import com.devjoaosilveira.dslist.dto.GameMinDTO;
import com.devjoaosilveira.dslist.entities.Game;
import com.devjoaosilveira.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameMinDTO>> findAll() {
        return ResponseEntity.ok().body(gameService.findAll());
    }

}
