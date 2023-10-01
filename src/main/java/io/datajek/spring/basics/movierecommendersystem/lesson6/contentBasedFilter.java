package io.datajek.spring.basics.movierecommendersystem.lesson6;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("CBF")
public class contentBasedFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public String name = "content";

    public contentBasedFilter(){
        logger.info("contentBasedFilter : constructor invoked...");
    }

    @PostConstruct
    private void postConstruct(){
        logger.info("contentBasedFilter : postConstruct invoked ...");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In contentBasedFilter preDestroy method");
    }

    public String getName(){
        return name;
    }
    public String[] getRecommendations(String movie){
        // TODO : logic of content based filter
        return new String[]{ "happy feel", "Ice Age", "Shark Tale"};
    }
}
