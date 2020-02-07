package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring config file

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from spring container
        Coach theCoach = context.getBean("theCoach",Coach.class);

        Coach theBaseballCoach = context.getBean("theBaseballCoach",Coach.class);



        //call methods in bean

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theBaseballCoach.getDailyWorkout() + " & " + theBaseballCoach.getDailyFortune());


        // close application context
        context.close();
    }
}
