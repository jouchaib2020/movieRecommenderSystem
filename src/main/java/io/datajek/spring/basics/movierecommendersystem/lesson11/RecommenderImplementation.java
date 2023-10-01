package io.datajek.spring.basics.movierecommendersystem.lesson11;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommenderImplementation {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final contentBasedFilter filter;

    public RecommenderImplementation(contentBasedFilter filter){
        this.filter = filter;
    }
    public List<Movie> getAll(){
        return filter.getAll();
}
    public Movie getMovie(String name){
        return filter.getMovie(name);
    }
    public void insertMovie(Movie movie){
        filter.insertMovie(movie);
    }
    public Movie recommendMovies(Movie movie){
        filter.sayHi();
        logger.info("filter in use : "+ filter.getName());
        return filter.getRecommendations(movie);
    }
}
