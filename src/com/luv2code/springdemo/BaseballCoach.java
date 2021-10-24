package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //define private field for the dependency
    private FortuneService fortuneService;

    //define a constructor
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 mins on batting";
    }

    @Override
    public String getDailyFortune() {

        //use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
