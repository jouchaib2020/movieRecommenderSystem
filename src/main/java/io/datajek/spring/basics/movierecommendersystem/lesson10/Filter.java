package io.datajek.spring.basics.movierecommendersystem.lesson10;

public interface Filter {
    public String getName();
    default void sayHi(){
        System.out.println("Hi from interface");
    }
    public String[] getRecommendations(String movie);
}
