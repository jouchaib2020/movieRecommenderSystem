package io.datajek.spring.basics.movierecommendersystem.lesson11;

import io.datajek.spring.basics.movierecommendersystem.lesson8.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface MovieRepo extends JpaRepository<io.datajek.spring.basics.movierecommendersystem.lesson11.Movie, Integer> {
    // Inherited CRUD methods are available
    io.datajek.spring.basics.movierecommendersystem.lesson11.Movie findFirstByOrderByNameAsc();
    Optional<io.datajek.spring.basics.movierecommendersystem.lesson11.Movie> findByName(String name);
    @Query("select distinct m FROM Movie m ")
    List<io.datajek.spring.basics.movierecommendersystem.lesson11.Movie> findFirstTen();
}
