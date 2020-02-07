package com.spring.demo;

public class BaseballCoach implements  Coach {
 private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService=theFortuneService;
    }

    public BaseballCoach() {

    }


    public String getDailyWorkout() {
        return "Spend 30  minutes on practice";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
