package io.datajek.spring.basics.movierecommendersystem.lesson8;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class contentBasedFilter implements Filter {
    private static int instances = 0;
    private final  Logger logger = LoggerFactory.getLogger(this.getClass());
    private final MovieRepo movieRepo;

    @Autowired
    public contentBasedFilter(MovieRepo movieRepo){
        this.movieRepo = movieRepo;
        instances++;
        logger.info("CBF constructor invoked ....");
    }


    public List<Movie> getAll(){
        return movieRepo.findAll();
    }
    public Movie getMovie(String name){
        Optional<Movie> tmpMovie  = movieRepo.findByName(name);

        if(tmpMovie.isPresent())
            throw new RuntimeException("Movie name not found");

        return tmpMovie.get();
    }
    public void insertMovie(Movie movie){
        movieRepo.save(movie);
    }



    @PostConstruct
    private void postConstruct(){
        logger.info("CBF : post construction....");
    }
    @PreDestroy
    private void preDestroy(){
        logger.info("CBF : pre destruction ....");
    }

    public String name = "content";
    public String getName(){
        return name;
    }
    public static int getInstances(){
        return contentBasedFilter.instances;
    }
    public Movie getRecommendations(Movie movie){
        // TODO : logic of content based filter
        return movieRepo.findFirstByOrderByNameAsc();
    }
}
