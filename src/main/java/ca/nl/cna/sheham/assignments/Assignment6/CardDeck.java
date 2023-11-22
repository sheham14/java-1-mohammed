package ca.nl.cna.sheham.assignments.Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class for the deck of cards
 */
public class CardDeck {

    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 15;
    private static final int NUM_SUITS = 4;
    private static final int DECK_SIZE = 52;

    /**
     * A method to create the deck of playing cards
     * @param deckArray The array of the deck of cards
     * @return The deck of cards.
     */
    public static ArrayList<PlayingCard> createDeck(ArrayList<PlayingCard> deckArray){
        for (int i = MIN_VALUE; i < MAX_VALUE; i++ ){
            for(int j = 0; j < NUM_SUITS; j++){
                PlayingCard card = new PlayingCard(i, PlayingCard.Suit.values()[j]);
                deckArray.add(card);

            }
        }return deckArray;
    }

    /**
     * A method to shuffle the created deck of cards
     * @param deckArray The deck of cards
     * @return The shuffled deck of cards
     */
    public static ArrayList<PlayingCard> shuffleDeck(ArrayList<PlayingCard> deckArray){
        Collections.shuffle(deckArray);
        return deckArray;
    }

    public static ArrayList<PlayingCard> drawCard(ArrayList<PlayingCard> deckArray){

        int i = ThreadLocalRandom.current().nextInt(0, DECK_SIZE);
        ArrayList<PlayingCard> drawnCard = new ArrayList<>();
        drawnCard.add(deckArray.get(i));
        deckArray.remove(deckArray.get(i));
        return drawnCard;

    }
}
