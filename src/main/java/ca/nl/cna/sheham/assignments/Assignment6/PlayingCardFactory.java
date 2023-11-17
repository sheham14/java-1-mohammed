package ca.nl.cna.sheham.assignments.Assignment6;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PlayingCardFactory {
    public static PlayingCard generateCard() {

        int min = 2;
        int max = 14;
        int randValue = ThreadLocalRandom.current().nextInt(min, max + 1);
        int suitIndex = ThreadLocalRandom.current().nextInt(0,4);
        PlayingCard.Suit randomSuit = PlayingCard.Suit.values()[suitIndex];
        return new PlayingCard(randValue,randomSuit);
        }

    public static PlayingCard generateSuitCard(PlayingCard.Suit suit) {

        int min = 2;
        int max = 14;
        int randValue = ThreadLocalRandom.current().nextInt(min, max + 1);
        return new PlayingCard(randValue,suit);
    }
}


