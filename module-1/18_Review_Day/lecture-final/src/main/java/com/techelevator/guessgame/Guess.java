package com.techelevator.guessgame;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        final Guess game = new Guess();
        game.run();
    }

    public void run() {
        final GameLogic logic = new GameLogic();
        final UserInterface ui = new UserInterface();

        ui.sayPrompt();
        while (true) { // game flow
            int guess = ui.getGuess();
            GameLogic.GuessResult result = logic.guessOutcome(guess);
            ui.reportResult(result);
            if (result == GameLogic.GuessResult.CORRECT) {
                break;
            }
        }
    }
}
