package io.datajek.spring.basics.movierecommendersystem.aop;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    public String getUserDetails() {
        //interacts with the User repository
        return "user details";
    }
}


