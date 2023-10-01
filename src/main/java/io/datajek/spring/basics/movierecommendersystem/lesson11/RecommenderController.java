package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecommenderController {
    public final RecommenderImplementation recommender;

    @Autowired
    public RecommenderController( contentBasedFilter filter){
        this.recommender  = new RecommenderImplementation(filter);
    }

    @GetMapping("/")
    public String getHome(){
        return "Hello server 🎊🤣🔥👋👑🤌🤌🥲🤓🤓";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/movies")
    public List<Movie> getAll() {
        return recommender.getAll();
    }

    @GetMapping("/movies/{name}")
    public Movie getMovie(@PathVariable String name){
        return recommender.getMovie(name);
    }

    @PostMapping("/movies")
    public String insertMovie(@RequestBody Movie movie){
        recommender.insertMovie(movie);
        return "Movie inserted successfully";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/recommend")
    public Movie home(){
        Movie movie = new Movie("Hairy Ikhan", 8.9, "comedy");

        return recommender.recommendMovies(movie);
    }
}
