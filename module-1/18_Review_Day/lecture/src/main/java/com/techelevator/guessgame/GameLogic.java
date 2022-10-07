package com.techelevator.guessgame;

public class GameLogic {

    public enum GuessResult {
        CORRECT,
        TOOLOW,
        TOOHIGH
    }
    final int secret;                                                   // field is marked as final

    public GameLogic() {                                                // Constructor
    secret = (int) (Math.random() * 100) + 1;                           // game logic
    }

    public GuessResult guessOutcome(int guess) {                        // return type is String
        if (guess == secret) {
            return GuessResult.CORRECT;
        } else if (guess < secret) {
            return GuessResult.TOOLOW;
        } else {
            return GuessResult.TOOHIGH;
        }
    }
}
