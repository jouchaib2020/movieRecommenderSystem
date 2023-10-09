package io.datajek.spring.basics.movierecommendersystem.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Filter2 {
    @Autowired
    private User user;

    public String collaborativeFiltering() {
        String userDetails =  user.getUserDetails();
        return userDetails;
    }
}
