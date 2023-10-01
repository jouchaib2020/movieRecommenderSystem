package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie){
        //TODO : Implement a content-based filter to find similar movies
        contentBasedFilter filter = new contentBasedFilter();
        String[] recommendedMovies = filter.getRecommendation(movie);
        return recommendedMovies;
    }
}
