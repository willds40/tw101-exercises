package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Will on 12/14/16.
 */
public class Guess {
    public void guessNumber (int random){
        Game game = new Game();
        System.out.println("Pleasen enter a guess");
        Scanner input = new Scanner(System.in);
            int guess = Integer.parseInt(input.next());
            while (game.playGame(guess,random) != "win") {
                input = new Scanner(System.in);
                guess = Integer.parseInt(input.next());

            }

        }
    }



