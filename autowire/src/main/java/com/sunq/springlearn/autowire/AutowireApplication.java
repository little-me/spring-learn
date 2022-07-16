package com.sunq.springlearn.autowire;

import com.sunq.springlearn.autowire.model.RichMan;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowireApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AutowireApplication.class, args);
        RichMan richMan = context.getBean(RichMan.class);
        System.out.println(richMan.getTesla().getClass().toString());
    }

}
