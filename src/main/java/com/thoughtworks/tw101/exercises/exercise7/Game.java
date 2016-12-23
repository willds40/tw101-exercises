package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Will on 12/14/16.
 */
public class Game {
    private String status;
    //private int randomNumber;

    public void SetupGame(){
        RandomNumber random = new RandomNumber();
        int randomNumber = random.getRandomNumber();
        Guess guess = new Guess();
        guess.guessNumber(randomNumber);
    }


    public String playGame(int guess, int randomNumber ) {
        if (randomNumber == guess){
            System.out.println("You guessed the right number; You win!");
            status = "win";
        }else if (randomNumber> guess){
            System.out.println("Your number is too low, guess again!");
            status = "lose";
        }else{
            System.out.println("Your number is too high, guess again!");
            status = "lose";
        }
        return status;
    }

}
