package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter filter;
    public String[] recommendMovies(String movie){
        filter.sayHi();
        System.out.println("filter in use : "+ filter.getName());
        String[] recommendedMovies = filter.getRecommendations(movie);
        return recommendedMovies;
    }
}
