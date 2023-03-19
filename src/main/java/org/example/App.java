package org.example;

import org.example.config.AppConfig;
import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        CustomerService customerService = context.getBean(CustomerService.class);
//        Customer customer = customerService.get(1L).orElseThrow();
//        System.out.println(customer);

        var context = SpringApplication.run(App.class, args);

        try (context) {
            CustomerService customerService = context.getBean(CustomerService.class);
            Customer customer = customerService.get(1L).orElseThrow();
            System.out.println(customer);

            Customer i = customerService.findByFirstLetterInLogin("I").orElseThrow();
            System.out.println(i);

            Long aLong = customerService.countByIdMoreThan(1L);
            System.out.println(aLong);

        }
    }
}
