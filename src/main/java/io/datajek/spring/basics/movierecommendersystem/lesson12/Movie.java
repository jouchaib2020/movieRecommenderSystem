package io.datajek.spring.basics.movierecommendersystem.lesson12;


import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String name;
    private double rating;
    private String genre;

    public Movie( String name, double rating, String genre){
        super();
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("Movie : constructor invoked...");
    }
    public Movie(){};

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getRating(){
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
