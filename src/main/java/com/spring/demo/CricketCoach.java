package com.spring.demo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    public String getDailyWorkout() {
        return "Practice fat bowling in 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method -setFortuneService");
        this.fortuneService = fortuneService;
    }
    private CricketCoach(){
        System.out.println("Cricket Coach: inside no-arg constructor");
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: inside setter method -email");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: inside setter method -team");
        this.team = team;
    }
}
