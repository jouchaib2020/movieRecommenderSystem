package io.datajek.spring.basics.movierecommendersystem.lesson12;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        Movie movie = new Movie("Hairy Ikhan", 8.9, "comedy");

        System.out.println("Application running on port : 8080");



    }

}
