package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class Game {
    private String status;
    private int randomNumber;
    private ArrayList<Integer> guesses;


    public void startGame(){
        RandomNumber random = new RandomNumber();
        Guess guess = new Guess();
        int randomNumber = random.getRandomNumber();
        guess.guessNumber(randomNumber);

        status = "lose";

    }
    public String playGame(int guess, int randomNumber) {
        if (randomNumber == guess){
            System.out.println("You guessed the right number; You win!" );
            System.out.println("Here are the list of guesses:");
            if(guesses == null){
                guesses = new ArrayList<>();
            }
            guesses.add(guess);
            for (int userGuess: guesses){
                System.out.println(userGuess);
            }

            status = "win";
        }else if (randomNumber> guess){
            System.out.println("Your number is too low, guess again.");
            if(guesses == null){
                guesses = new ArrayList<>();
            }
            guesses.add(guess);
            status = "lose";

        }else{
            if(guesses == null){
                guesses = new ArrayList<>();
            }
            System.out.println("Your number is too high, guess again.");
            guesses.add(guess);
            status = "lose";
        }

        return status;
    }
}
