/**
 * a) Create a class called ‘PlayingCard’ that does the following:
 *  Has a constructor which creates the card - it should have a valid suit and a value.
 *  You should have getters only for these values.
 *  Note: use constants for suits and think of how you can constrain the value. Hint: You can
 * use constants or enums.
 *  Override the toString method to print the playing card like “8 ♣” or “K ♦” (static). (Hint:
 * google ‘unicode character for diamond’)
 *  Bonus: Print an ASCII Art version of the Card to the a print screen like the following:
 * printAsciiCard(PlayingCard playingCard, PrintStream printStream)
 * b) Create a class called “PlayingCardFactory” that has the following methods:
 * • Generate Random Card (static)
 * • Generate Random Card from a suit (static)
 * c) Create a class called ‘CardDeck’ that has the following methods:
 * • Has an ArrayList of Playing cards
 * • Starts with a full deck of cards
 * • Can be shuffled
 * • Can draw a card
 * • Create an application with a menu that let’s you a) draw a card b) draw a hand c) print the
 * deck, d) shuffle the deck and e) print out the deck
 * College of the North Atlantic
 * CP2280 – Object Oriented Programming in Java
 * Assignment 6
 */

package ca.nl.cna.sheham.assignments.Fall2023.Assignment6;