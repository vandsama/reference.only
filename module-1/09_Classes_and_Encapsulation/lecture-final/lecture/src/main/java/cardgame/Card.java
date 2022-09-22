package cardgame;

public class Card {

    private final static String[] SUIT_NAMES = {"Spades", "Diamonds", "Clubs", "Hearts"};

    // properties
    private int rank = 0;
    private int suit = 0;
    private boolean isFaceUp = true;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(int rank, int suit, boolean faceUp) {
        this(rank, suit);
        this.isFaceUp = faceUp;
    }

    // setters & getters
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
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
            name = String.format("%s of %s", getRank(), Card.SUIT_NAMES[this.getSuit()-1]);
        }
        return name;
    }

}
