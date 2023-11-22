package ca.nl.cna.sheham.assignments.Assignment6;
import java.io.PrintStream;

/**
 * A class for a playing card
 */
public class PlayingCard {
    public static final int ACE = 14;
    private final int value;
    private final Suit suit;

    /**
     * Constructor for the playing card containing the value and the suit
     * @param value The value of the card
     * @param suit The suit of the card
     */
    public PlayingCard(int value, Suit suit) {
        if (value > ACE || value < 2 ) {
            throw new IllegalArgumentException("Invalid card value");
        }
        this.value = value;
        this.suit = suit;
    }

    /**
     * Gets the value of the card and returns it
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets the suit of the card and returns it
     * @return suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Prints the playing card in a specific format of the card number followed by the suit.
     * The suit characters have been assigned to their names as well.
     * @param playingCard The playing card
     * @param printStream The print format of the card
     */
    public static void printAsciiCard(PlayingCard playingCard, PrintStream printStream) {
        int value = playingCard.getValue();
        char suitSymbol;
        switch (playingCard.getSuit()) {
            case DIAMONDS -> suitSymbol = '♢';
            case HEARTS -> suitSymbol = '♡';
            case CLUBS -> suitSymbol = '♧';
            case SPADES -> suitSymbol = '♤';
            default -> throw new IllegalArgumentException("Invalid suit");
        }
        printStream.println(value + suitSymbol + '\n');
    }

    /**
     * Overrides the print method to print the Jack, Queen, King, and Ace when the card number is above 10.
     * Also prints the assigned characters of each suit when printed.
     * @return The printed card
     */
    @Override
    public String toString() {
        String valueString = switch (value) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 14 -> "A";
            default -> String.valueOf(value);
        };

        char suitSymbol;
        switch (getSuit()) {
            case DIAMONDS -> suitSymbol = '♢';
            case HEARTS -> suitSymbol = '♡';
            case CLUBS -> suitSymbol = '♧';
            case SPADES -> suitSymbol = '♤';
            default -> throw new IllegalArgumentException("Invalid suit");
        }

        return valueString + " " + suitSymbol;
    }

    /**
     * The list of suits
     */
    public enum Suit {DIAMONDS, HEARTS, CLUBS, SPADES}

}



