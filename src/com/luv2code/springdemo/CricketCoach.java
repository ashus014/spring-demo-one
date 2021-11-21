package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //add new fields for email address & team
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("Cricket Coach : Inside no-args Constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach : Inside Setter method ");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach : Inside Setter method - Inside setEmailAddress ");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach : Inside Setter method - Inside setTeam ");
        this.team = team;
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
