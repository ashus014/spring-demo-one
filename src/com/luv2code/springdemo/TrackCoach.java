package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService theFortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5K";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it " + theFortuneService.getFortune();
    }
}
