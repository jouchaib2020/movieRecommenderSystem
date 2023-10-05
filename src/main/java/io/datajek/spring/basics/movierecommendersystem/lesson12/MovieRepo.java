package io.datajek.spring.basics.movierecommendersystem.lesson12;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(path="movies")
public interface MovieRepo extends JpaRepository<Movie, Integer> {
    // Inherited CRUD methods are available
}
