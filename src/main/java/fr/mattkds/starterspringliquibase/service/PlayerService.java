package fr.mattkds.starterspringliquibase.service;

import fr.mattkds.starterspringliquibase.entity.Player;
import fr.mattkds.starterspringliquibase.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> findPlayers() {
        return this.playerRepository.findAll();
    }
}
