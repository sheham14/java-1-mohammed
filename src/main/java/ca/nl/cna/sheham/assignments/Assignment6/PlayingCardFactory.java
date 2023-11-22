package ca.nl.cna.sheham.assignments.Assignment6;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A class with methods to generate random cards and random cards from specified suits.
 */
public class PlayingCardFactory {

    /**
     * Generates a random playing card
     * @return random playing card
     */
    public static PlayingCard generateCard() {

        int min = 2;
        int max = 14;
        int randValue = ThreadLocalRandom.current().nextInt(min, max + 1);
        int suitIndex = ThreadLocalRandom.current().nextInt(0,4);
        PlayingCard.Suit randomSuit = PlayingCard.Suit.values()[suitIndex];
        return new PlayingCard(randValue,randomSuit);
        }

    /**
     * Generates a random playing card from a specified suit
     * @param suit The suit of the card
     * @return The random playing card from the specified suit
     */
    public static PlayingCard generateSuitCard(PlayingCard.Suit suit) {

        int min = 2;
        int max = 14;
        int randValue = ThreadLocalRandom.current().nextInt(min, max + 1);
        return new PlayingCard(randValue,suit);
    }
}


