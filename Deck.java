package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cards;
	private Random random; //Initialization - generates random indices to access elements
	
	public Deck() {
		cards = new ArrayList<>(); //Initializing the deck with Card objects
		random = new Random();// Initialize the Random instance
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit: suits) { //iterates over each suit
			for (int i = 0; i < values.length; i++) { //iterates over the values
				cards.add(new Card(i + 2, values[i] + " of " + suit)); //new card is created combining value and suit and then added to the 52 card list
			}
		}
		
	}
	public void shuffle() {
		for (int i = cards.size() - 1; i > 0; i--) { // This loop starts from end of the list decrementing down to 1
			int j = random.nextInt(i + 1); // For every index of I, a random index of j is generated
			Card temp = cards.get(i); // The elements of i & j are swapped
			cards.set(i, cards.get(j));
			cards.set(j, temp);
			}
		}
	
	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		} else {
			return null;
		}
	}
	
	
	}
	
