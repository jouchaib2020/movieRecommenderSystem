package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.lesson3.Filter;
import org.springframework.stereotype.Component;

@Component
public class collaborativeFilter implements Filter {
    public String name = "collab";

    public String getName(){
        return name;
    }
    public String[] getRecommendations(String movie){

        return new String[] {"Ikhan 1", "Ikhan 2", "Ikhan 3"};
    }
}
