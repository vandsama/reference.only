package com.techelevator.cardgame;

public class Card {

    private final static String[] SUIT_NAMES = { "Spades", "Diamonds", "Clubs", "Hearts" };

    // properties
    private Ranks rank;
    private Suits suit;
    private boolean isFaceUp = true;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(Ranks rank, Suits suit, boolean faceUp) {
        this(rank, suit);
        this.isFaceUp = faceUp;
    }

    // setters & getters
    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public Suits getSuit() {
        return this.suit;
    }

    public boolean getFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    public String getCardName() {
        String name = "###";
        if (isFaceUp) {
            name = String.format("%s of %s", getRank(), getSuit());
        }
        return name;
    }

}
