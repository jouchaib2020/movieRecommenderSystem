package io.datajek.spring.basics.movierecommendersystem.lesson9;

import io.datajek.spring.basics.movierecommendersystem.lesson8.Movie;
import io.datajek.spring.basics.movierecommendersystem.lesson8.MovieRepo;
import io.datajek.spring.basics.movierecommendersystem.lesson8.contentBasedFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"io.datajek.spring.basics.movierecommendersystem.lesson9",
        "io.datajek.spring.basics.movierecommendersystem.lesson8"})
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        //RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
        //String[] recommendedMovies  = recommender.recommendMovies("harry potter");
        //System.out.println(Arrays.toString(recommendedMovies));

        contentBasedFilter filter = appContext.getBean(contentBasedFilter.class);
        System.out.println("\nContentBasedFilter bean with singleton scope");
        System.out.println(filter);

        /*//Retrieve prototype bean from the singleton bean thrice
        MovieRepo movie1 = filter.getMovie();
        MovieRepo movie2 = filter.getMovie();
        MovieRepo movie3 = filter.getMovie();

        System.out.println("\nMovie bean with prototype scope");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);

        //Print number of instances of each bean
        System.out.println("\nContentBasedFilter instances created: "+
                contentBasedFilter.getInstances());
        System.out.println("Movie instances created: ");*/


    }

}
