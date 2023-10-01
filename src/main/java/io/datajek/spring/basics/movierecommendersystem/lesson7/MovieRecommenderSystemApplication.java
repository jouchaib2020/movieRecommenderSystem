package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Scanner;


@SpringBootApplication
public class MovieRecommenderSystemApplication {
    @Bean
    public Filter contenBasedFilter(){
        return new contentBasedFilter();
    }

    @Bean
    public Filter collaborativeFilter(){
        return new collaborativeFilter();
    }

    public static void main(String[] args) {


        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
                MovieRecommenderSystemApplication.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filter name : ");
        String input = scanner.nextLine().trim();

        Filter filter = appContext.getBean(input, Filter.class);
        RecommenderImplementation recommender = new RecommenderImplementation(filter);

        String[] recommendedMovies  = recommender.recommendMovies("harry potter");
        System.out.println(Arrays.toString(recommendedMovies));

        scanner.close();
        appContext.close();
    }

}
