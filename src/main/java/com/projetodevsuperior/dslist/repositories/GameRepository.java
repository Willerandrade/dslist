package com.projetodevsuperior.dslist.repositories;

import com.projetodevsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
