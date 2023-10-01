package io.datajek.spring.basics.movierecommendersystem.lesson11;


import java.util.List;

public interface Filter {
    public String getName();
    default void sayHi(){
        System.out.println("Hi from interface");
    }
    public Movie getRecommendations(Movie movie);
}
