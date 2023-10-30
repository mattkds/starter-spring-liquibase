package fr.mattkds.starterspringliquibase.repository;

import fr.mattkds.starterspringliquibase.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
