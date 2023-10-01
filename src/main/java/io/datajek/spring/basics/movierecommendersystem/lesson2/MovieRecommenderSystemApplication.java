package io.datajek.spring.basics.movierecommendersystem.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        contentBasedFilter filter = new contentBasedFilter();
        RecommenderImplementation recommender = new RecommenderImplementation(filter);
        String[] recommendedMovies  = recommender.recommendMovies("harry potter");
        System.out.println(Arrays.toString(recommendedMovies));

        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
    }

}
