package cardgame;

import java.io.PrintStream;
import java.util.List;

public class Table {
    public static void main(String[] args) {

        Deck d = new Deck();
        List<Card> cards = d.getCards();


        d.shuffle();

        displayCards(cards);
    }

    private static void displayCards(List<Card> cards) {
        for (Card card : cards) {
            System.out.printf("%s of %s\n", card.getRank(), cards.getSuit());
        }
    }
}
