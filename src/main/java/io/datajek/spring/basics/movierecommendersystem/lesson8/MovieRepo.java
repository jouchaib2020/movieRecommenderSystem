package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface MovieRepo extends JpaRepository<Movie, Integer> {
    // Inherited CRUD methods are available
    Movie findFirstByOrderByNameAsc();
    Optional<Movie> findByName(String name);
    @Query("select distinct m FROM Movie m ")
    List<Movie> findFirstTen();
}
