package io.datajek.spring.basics.movierecommendersystem.relationships;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository <Player, Integer> {
}
