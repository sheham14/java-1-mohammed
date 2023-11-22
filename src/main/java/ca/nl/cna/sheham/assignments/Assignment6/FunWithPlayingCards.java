package ca.nl.cna.sheham.assignments.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The application for the playing cards.
 * Decks can be created and shuffled.
 * Cards and Hands can be drawn from a deck.
 */
public class FunWithPlayingCards {
    public static void main(String[] args) {

        System.out.println("Lets have fun with Playing Cards!" );
        Scanner input = new Scanner(System.in);
        char c;
        do {
            ArrayList<PlayingCard> playingCardArray = new ArrayList<>();
            playingCardArray = CardDeck.createDeck(new ArrayList<>());
            System.out.printf("""
                    A. Print Deck
                    B. Shuffle Deck
                    C. Draw Card
                    D. Draw Hand
                    Q. Quit
                    Enter choice:
                    """);

            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                System.out.println(playingCardArray);
            } else if (c == 'B') {
                CardDeck.shuffleDeck(playingCardArray);
                System.out.println("Deck shuffled.");
//                System.out.println(CardDeck.shuffleDeck(playingCardArray));
            } else if(c == 'C'){
                System.out.println(CardDeck.drawCard(playingCardArray));
//                System.out.println(playingCardArray);
            } else if(c == 'D'){
                for(int i = 0; i < 5; i++){
                    System.out.println(CardDeck.drawCard(playingCardArray));
                }
            }

        } while(c != 'Q');
        System.out.println("\nGame ended!");
    }
}
