package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
    private Filter filter;
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }
    public String[] recommendMovies(String movie){
        //TODO : Implement a content-based filter to find similar movies
        //contentBasedFilter filter = new contentBasedFilter();
        filter.sayHi();
        System.out.println("filter in use : "+ filter.getName());
        String[] recommendedMovies = filter.getRecommendations(movie);
        return recommendedMovies;
    }
}
