package ca.nl.cna.sheham.assignments.Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Class for the deck of cards
 */
public class CardDeck {

    private static final int MIN_VALUE = 2;
    private static final int NUM_SUITS = 4;
    private static final int DECK_SIZE = 52;

    private final ArrayList<PlayingCard> deckArray;

    /**
     * A method to create the deck of playing cards
     */
    public CardDeck() {
        this.deckArray = new ArrayList<PlayingCard>();
        for (int i = MIN_VALUE; i <= PlayingCard.ACE; i++) {
            for (int j = 0; j < NUM_SUITS; j++) {
                PlayingCard card = new PlayingCard(i, PlayingCard.Suit.values()[j]);
                this.deckArray.add(card);
            }
        }
    }

    /**
     * A method to shuffle the created deck of cards
     */
    public void shuffleDeck() {
        Collections.shuffle(deckArray);
    }

    /**
     * A method to draw a card from the deck
     */
    public PlayingCard drawCard() {
        return deckArray.remove(0);
    }

    /**
     * A method to print the deck of cards
     */
    public void printDeck() {
        for (PlayingCard i : this.deckArray) {
            System.out.println(i);
        }
    }
}

