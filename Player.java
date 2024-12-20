package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.setHand(new ArrayList<>()); // initializes empty hand
		this.setScore(0);
		this.setName(name);
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + "'s" + " score is " + score + ".");
		if(hand.isEmpty()) {
			System.out.println(name + "has no cards in hand.");
		} else { 
			System.out.println(name + " has the following cards:");
			for (Card card : hand) { // loops through each card in the players hand
				card.describe(); // calling the describe method to describe each card in hand
			}
		}
	
	}
	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0); // removes and returns top card, 0 index being first in list
		} else {
			return null; //if hand is empty, returns null
		}
	}
	
	public void draw(Deck deck) {
		Card drawCard = deck.draw(); // deck.draw should return the top card of the deck
		if (drawCard != null) {
			hand.add(drawCard); // adds drawn card to hand
			//System.out.println(name + " drew the card: ");
			//drawCard.describe(); //prints card description
		} else {
		System.out.println(name + " is unable to draw a card due to the deck being empty.");
		}
	}
	
	public void incrementScore() {
		score += 1;
		System.out.println(name + "'s sore is: " + score);
	}
}
