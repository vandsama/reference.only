package com.techelevator.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public static final int SPADES = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;
    public static final int HEARTS = 4;

    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private List<Card> cards = new ArrayList<>();

    public Deck(boolean dealFaceUp) {
        int[] pokerSuits = { SPADES, DIAMONDS, CLUBS, HEARTS };
        int[] pokerRanks = { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };

        for (int suit : pokerSuits) {
            for (int rank : pokerRanks) {
                Card c = new Card(rank, suit, dealFaceUp);
                cards.add(c);
            }
        }
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

}
