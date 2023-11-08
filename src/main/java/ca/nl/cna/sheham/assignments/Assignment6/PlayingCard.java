package ca.nl.cna.sheham.assignments.Assignment6;
import java.io.PrintStream;

public class PlayingCard {

    public static final int ACE = 14;

    private int value; //TODO Make sure this value falls between 2 and ACE

    private Suit suit;

    public PlayingCard(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public static void printAsciiCard(PlayingCard playingCard, PrintStream printStream){
        //TODO Write this method
        //TODO Find the ASCII Values for the suits and print them out!
        //Hint: create a char form a unicode value and find the suits online


    }

    public enum Suit {DIAMONDS, HEARTS, CLUBS, SPADES};
    char diamonds = '\u2662';
    char hearts = '\u2661';
    char clubs = '\u2667';
    char spades = '\u2664';



}



