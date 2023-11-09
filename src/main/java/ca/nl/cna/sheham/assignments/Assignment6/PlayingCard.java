package ca.nl.cna.sheham.assignments.Assignment6;

import java.io.PrintStream;

public class PlayingCard {

    public static final int ACE = 14;
    private final int value; //TODO Make sure this value falls between 2 and ACE
    private final Suit suit;

    public PlayingCard(int value, Suit suit) {
        if (value > ACE || value < 2 ) {
            throw new IllegalArgumentException("Invalid card value");
        }
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public static void printAsciiCard(PlayingCard playingCard, PrintStream printStream) {
        //TODO Write this method
        //TODO Find the ASCII Values for the suits and print them out!
        //Hint: create a char form a unicode value and find the suits online
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

    public enum Suit {DIAMONDS, HEARTS, CLUBS, SPADES}

}



