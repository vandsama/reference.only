package com.techelevator.cardgame;

import java.util.List;

public class Table {
    public static void main(String[] args) {

        Card badCard = new Card(1000000, 19);

        Deck d = new Deck(false);
        List<Card> cards = d.getCards();

        displayCards(cards);

        System.out.println("============");
        d.shuffle();

        displayCards(cards);
    }

    private static void displayCards(List<Card> cards) {
        for (Card card : cards) {
            System.out.println(card.getCardName());
        }
    }
}
