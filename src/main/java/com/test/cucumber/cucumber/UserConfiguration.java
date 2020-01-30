package com.test.cucumber.cucumber;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    public UserConfiguration(){
        //Para Spring
    }

    @Bean
    public IUserService buildUserService(){
        return new InMemmoryUserService();
    }
}