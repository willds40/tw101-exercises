package com.thoughtworks.tw101.exercises.exercise7;

public class RandomNumber {
    private int randomNumber;


    public int getRandomNumber(){
        double r = Math.random();
        double d = r * 100;
        randomNumber = (int)d + 1;
        //System.out.println(randomNumber);
        return randomNumber;
    }

}
