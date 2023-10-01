package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Value("${favoriteMovie}")
    String favoriteMovie;
    @Autowired
    @Qualifier("CBF")
    private Filter filter;

    public String returnFavoriteMovies(){
        return favoriteMovie;
    }
    public String[] recommendMovies(String movie){
        filter.sayHi();
        System.out.println("filter in use : "+ filter.getName());
        String[] recommendedMovies = filter.getRecommendations(movie);
        return recommendedMovies;
    }
}
