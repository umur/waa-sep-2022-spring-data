package com.waa.waalabthree;

import com.waa.waalabthree.Repository.IUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WaaLabThreeApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(WaaLabThreeApplication.class, args);
        IUserRepository iUserRepository=context.getBean(IUserRepository.class);
    }

}
