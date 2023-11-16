package com.devjoaosilveira.dslist.controllers;

import com.devjoaosilveira.dslist.dto.GameListDTO;
import com.devjoaosilveira.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gamelist")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping()
    public ResponseEntity<List<GameListDTO>> findAll() {
        return ResponseEntity.ok().body(gameListService.findAll());
    }

}
