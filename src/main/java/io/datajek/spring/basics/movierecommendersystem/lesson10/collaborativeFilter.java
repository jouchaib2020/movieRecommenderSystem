package io.datajek.spring.basics.movierecommendersystem.lesson10;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class collaborativeFilter implements Filter {
    public String name = "collab";

    public String getName(){
        return name;
    }
    public String[] getRecommendations(String movie){

        return new String[] {"Ikhan 1", "Ikhan 2", "Ikhan 3"};
    }
}
