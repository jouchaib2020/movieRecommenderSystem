package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.stereotype.Component;

@Component("collaborativeFilter")
public class collaborativeFilter implements Filter {
    public String name = "collab";

    public String getName(){
        return name;
    }
    public String[] getRecommendations(String movie){

        return new String[] {"Ikhan 1", "Ikhan 2", "Ikhan 3"};
    }
}
