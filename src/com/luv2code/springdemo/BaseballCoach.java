package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService theFortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 mins on batting";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }
}
