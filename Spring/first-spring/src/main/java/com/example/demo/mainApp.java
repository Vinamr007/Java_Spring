package com.example.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
    public static void main(String[] args) {
        // Use try-with-resources so the context is closed automatically
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml")) {
            // Match the bean id from applicationBeanContext.xml (id="Mybean")
            GratingService gratingService = context.getBean("Mybean", GratingService.class);
            gratingService.Sayhello();
        }
    }
}
