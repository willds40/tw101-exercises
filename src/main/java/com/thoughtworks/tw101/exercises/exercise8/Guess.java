package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by Will on 12/14/16.
 */
public class Guess {
    private int guess;
    public  void guessNumber(int randnom){
        Game game = new Game();
        System.out.println("Pleasen enter a guess");
        Scanner input = new Scanner(System.in);
        guess = 0;
        try {
            guess = Integer.parseInt(input.next());
            while (game.playGame(guess,randnom) == "lose") {
                input = new Scanner(System.in);
                guess = Integer.parseInt(input.next());
            }
        } catch (NumberFormatException e) {
            System.out.print("You enter an invalid number: ");
            guessNumber(randnom);
     }
    }
}


