package fr.mattkds.starterspringliquibase.controller;

import fr.mattkds.starterspringliquibase.entity.Player;
import fr.mattkds.starterspringliquibase.service.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = playerService.findPlayers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }
}
