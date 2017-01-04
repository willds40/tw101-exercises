package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private String status;
    private int randomNumber;
    private ArrayList<Integer> guesses = new ArrayList<Integer>();

    public void startGame(){
        RandomNumber random = new RandomNumber();
        int randomNumber = random.getRandomNumber();
        int userGuess = 0;
        System.out.println("Please enter a guess");
        Scanner input = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            try {
                userGuess = Integer.parseInt(input.next());
                success= true;
                while (playGame(userGuess, randomNumber, guesses) == "lose") {
                    input = new Scanner(System.in);
                    userGuess = Integer.parseInt(input.next());
                }
            } catch (NumberFormatException e) {
                System.out.print("You enter an invalid number, guess again. \n ");
                success = false;

            }
        }
    }
    public static String playGame(int guess, int randomNumber, ArrayList<Integer> guesses) {
         String status = "lose";
        if (randomNumber == guess){
            System.out.println("You guessed the right number; You win!" );
            System.out.println("Here are the list of guesses:");
            guesses.add(guess);
            for (int userGuess: guesses){
                System.out.println(userGuess);
            }

            status = "win";
        }else if (randomNumber> guess){
            System.out.println("Your number is too low, guess again.");
            guesses.add(guess);
            status = "lose";

        }else{
            System.out.println("Your number is too high, guess again.");
            guesses.add(guess);
            status = "lose";
        }

        return status;
    }
}
