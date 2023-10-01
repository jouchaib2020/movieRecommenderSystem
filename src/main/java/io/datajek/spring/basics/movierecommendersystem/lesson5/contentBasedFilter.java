package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

@Component("CBF")
public class contentBasedFilter implements Filter {
    public String name = "content";

    public String getName(){
        return name;
    }
    public String[] getRecommendations(String movie){
        // TODO : logic of content based filter
        return new String[]{ "happy feel", "Ice Age", "Shark Tale"};
    }
}
