package ca.nl.cna.sheham.assignments.Fall2023.Assignment6;
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
        int suitMin = 1;
        int suitMax = 4;
        Random random = new Random();
        int randValue = random.nextInt(min,max);
        int suitIndex = random.nextInt(suitMin, suitMax);
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


