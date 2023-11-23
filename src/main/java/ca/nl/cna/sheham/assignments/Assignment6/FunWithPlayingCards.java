package ca.nl.cna.sheham.assignments.Assignment6;
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
        CardDeck cardDeck = new CardDeck();


        do {

            System.out.print("""
                    A. Print Deck
                    B. Shuffle Deck
                    C. Draw Card
                    D. Draw Hand
                    Q. Quit
                    Enter choice:
                    """);

            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                cardDeck.printDeck();
            } else if (c == 'B') {
                cardDeck.shuffleDeck();
                System.out.println("Deck shuffled.");
            } else if(c == 'C'){
                System.out.println(cardDeck.drawCard());
            } else if(c == 'D'){
                for(int i = 0; i < 5; i++){
                    System.out.println(cardDeck.drawCard());
                }
            }

        } while(c != 'Q');
        System.out.println("\nGame ended!");
    }
}
