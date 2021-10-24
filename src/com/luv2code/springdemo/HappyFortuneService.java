package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        String happyMessage = "Today is your lucky day";
        return happyMessage;
    }
}
