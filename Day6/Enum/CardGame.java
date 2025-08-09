//Q4
package assignment6_enum_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {

    // Enum for Suit
    enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    // Enum for Rank
    enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    // Card class with Suit and Rank
    static class Card {
        private final Suit suit;
        private final Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        
        public String toString() {
            return rank + " of " + suit;
        }
    }

    // Deck class containing 52 cards
    static class Deck {
        private final List<Card> cards;

        public Deck() {
            cards = new ArrayList<>();
            // Create all 52 cards
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(suit, rank));
                }
            }
        }

        // Shuffle the deck
        public void shuffle() {
            Collections.shuffle(cards);
        }

        // Print all cards in the deck
        public void printDeck() {
            for (Card card : cards) {
                System.out.println(card);
            }
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("Original deck:");
        deck.printDeck();

        System.out.println("\nShuffled deck:");
        deck.shuffle();
        deck.printDeck();
    }
}
