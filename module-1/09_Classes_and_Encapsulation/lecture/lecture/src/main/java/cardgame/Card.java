package cardgame;

public class Card {

    // properties
    private int rank = 0;
    private int suit = 0;

    // constructor
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // setters & getters
    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }


    public  int getSuit() {
        return this.suit;
    }


}

