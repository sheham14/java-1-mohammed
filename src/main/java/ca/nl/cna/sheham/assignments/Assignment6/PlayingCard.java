package ca.nl.cna.sheham.assignments.Assignment6;

import java.io.PrintStream;

/**
 * A class for a playing card
 */
public class PlayingCard {
    public static final int ACE = 14;
    public static final int KING = 13;
    public static final int QUEEN = 12;
    public static final int JACK = 11;
    private final int value;
    private final Suit suit;

    /**
     * Constructor for the playing card containing the value and the suit
     *
     * @param value The value of the card
     * @param suit  The suit of the card
     */
    public PlayingCard(int value, Suit suit) {
        if (value > ACE || value < 2) {
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
     * Overrides the print method to print the Jack, Queen, King, and Ace when the card number is above 10.
     * Also prints the assigned characters of each suit when printed.
     *
     * @return The printed card
     */
    @Override
    public String toString() {
        String valueString = switch (value) {
            case JACK -> "J";
            case QUEEN -> "Q";
            case KING -> "K";
            case ACE -> "A";
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



