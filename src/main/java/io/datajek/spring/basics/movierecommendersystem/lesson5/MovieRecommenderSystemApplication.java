package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;


@SpringBootApplication
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        String favoriteMovie  = recommender.returnFavoriteMovies();
        System.out.println("Favorite Movie is :"+favoriteMovie);

        String[] recommendedMovies  = recommender.recommendMovies("harry potter");
        System.out.println(Arrays.toString(recommendedMovies));
    }

}
