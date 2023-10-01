package io.datajek.spring.basics.movierecommendersystem.lesson10;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter filter;


    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    private String ikhan;

    @PostConstruct
    private void postConstruct(){
        logger.info("RecommenderImplementation : post construction invoked...");
    }
    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }

    //Any method that is autowired is automatically called
    /*@Autowired
    public void ikhan(@Qualifier("CBF") Filter filter){
        this.ikhan = "IKHAN IS HERE";
        System.out.println("IKHAN IS HERE");
    }*/

    public String[] recommendMovies(String movie){
        filter.sayHi();
        System.out.println("filter in use : "+ filter.getName());
        String[] recommendedMovies = filter.getRecommendations(movie);
        return recommendedMovies;
    }
}
