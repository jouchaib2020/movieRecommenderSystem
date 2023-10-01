package io.datajek.spring.basics.movierecommendersystem.lesson10;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;



public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("appContext.xml");

        //AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
        //        MovieRecommenderSystemApplication.class);

        //ConfigurableApplicationContext appContext = SpringApplication.run(
        //       MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        String[] recommendedMovies  = recommender.recommendMovies("harry potter");
        System.out.println(Arrays.toString(recommendedMovies));
        appContext.close();
    }

}
