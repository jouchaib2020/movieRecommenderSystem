package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBaseSeeder implements ApplicationRunner {
    private final MovieRepo movieRepo;

    @Autowired
    public DataBaseSeeder(MovieRepo movieRepo){
        this.movieRepo = movieRepo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Ali Baba", 5.0, "Drama"));
        movies.add(new Movie("The Matrix", 8.7, "Science Fiction"));
        movies.add(new Movie("Inception", 8.8, "Science Fiction"));
        movies.add(new Movie("The Shawshank Redemption", 9.3, "Drama"));
        movies.add(new Movie("Pulp Fiction", 8.9, "Crime"));
        movies.add(new Movie("Forrest Gump", 8.8, "Drama"));
        movies.add(new Movie("The Dark Knight", 9.0, "Action"));
        movies.add(new Movie("Titanic", 7.8, "Romance"));
        movies.add(new Movie("Avatar", 7.8, "Science Fiction"));
        movies.add(new Movie("Jurassic Park", 8.1, "Science Fiction"));
        movies.add(new Movie("Gladiator", 8.5, "Action"));
        movies.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", 8.8, "Fantasy"));
        movies.add(new Movie("The Godfather", 9.2, "Crime"));
        movies.add(new Movie("Fight Club", 8.8, "Drama"));
        movies.add(new Movie("The Silence of the Lambs", 8.6, "Crime"));
        movies.add(new Movie("Inglourious Basterds", 8.3, "War"));
        movies.add(new Movie("Interstellar", 8.6, "Science Fiction"));
        movies.add(new Movie("The Departed", 8.5, "Crime"));
        movies.add(new Movie("Eternal Sunshine of the Spotless Mind", 8.3, "Romance"));
        movies.add(new Movie("Schindler's List", 8.9, "Drama"));

        movieRepo.saveAll(movies);
    }
}
