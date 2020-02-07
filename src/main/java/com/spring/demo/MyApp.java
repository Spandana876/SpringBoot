package com.spring.demo;

public class MyApp {

    public static void main(String[] args) {

        //create the object
        Coach theCoach = new TrackCoach();
        Coach theBaseballCoach = new BaseballCoach();

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theBaseballCoach.getDailyWorkout());

    }
}
