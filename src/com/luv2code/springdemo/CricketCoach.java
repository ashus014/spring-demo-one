package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricket Coach : Inside no-args Constructor");
    }

    public FortuneService getTheFortuneService() {
        return fortuneService;
    }

    public void setTheFortuneService(FortuneService theFortuneService) {
        System.out.println("Inside Setter method ");
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
