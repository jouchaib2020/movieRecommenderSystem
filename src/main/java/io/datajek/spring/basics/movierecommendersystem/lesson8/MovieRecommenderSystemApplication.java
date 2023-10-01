package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        Movie movie = new Movie("Hairy Ikhan", 8.9, "comedy");

        //RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        //String[] recommendedMovies  = recommender.recommendMovies(movie);
        //System.out.println(Arrays.toString(recommendedMovies));
        System.out.println("Application running on port : 8080");



    }

}
