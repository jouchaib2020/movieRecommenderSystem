package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private final Filter filter;
    public RecommenderImplementation(Filter filter){
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        filter.sayHi();
        System.out.println("filter in use : "+ filter.getName());
        String[] recommendedMovies = filter.getRecommendations(movie);
        return recommendedMovies;
    }
}
