package week6;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck (); //deck is instantiated
		System.out.println("Shuffling the deck...");
		System.out.println();
		
		deck.shuffle(); //deck is shuffled calling the shuffle method from Deck class
		
		Player player1 = new Player("Deku"); //created two players
		Player player2 = new Player("Bakugo");
		
		System.out.println("The deck is now shuffled, the game is about to begin:");
		System.out.println();
		System.out.println("Player 1: " + player1.getName());
		System.out.println("Player 2: " + player2.getName());
		System.out.println();
		
		System.out.println("Dealing out the cards...");
		System.out.println();
		for (int i = 0; i < 52; i++) { //dealing 52 cards between 2 players
			if (i % 2 ==0) {
				player1.draw(deck); // player 1 draws on even iterations of the loop
			} else {
				player2.draw(deck);// player 2 draws draws on the odds
			}
		}
		System.out.println("All cards have now been dealt!");
		
		System.out.println("Let the game being!");
		System.out.println();
		for (int i = 0; i <26; i ++) { //iterates through the loop 26 times so each player takes an equal amount of turns through
			System.out.println("Round " + (i + 1) + ":");
			
			Card player1Card = player1.flip(); //each player flips a card
			Card player2Card = player2.flip();
			
			System.out.println(player1.getName() + " flips: ");
			player1Card.describe(); //describes the card flipped by the player
			System.out.println(player2.getName() + " flips: ");
			player2Card.describe();
			
			if (player1Card.getValue() > player2Card.getValue()) {
				System.out.println(player1.getName() + " wins the round!");
				player1.incrementScore();
			} else if (player1Card.getValue() < player2Card.getValue()) {
				System.out.println(player2.getName() + " wins the round!");
				player2.incrementScore();
			} else { 
				System.out.println("This round is a tie!");
			}
			System.out.println();// just to add extra space between rounds
		}
		
		System.out.println("Game Over!");
		System.out.println(player1.getName() + "'s score: " + player1.getScore());
		System.out.println(player2.getName() + "'s score: " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " is the winner!");
		} else if ( player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " is the winner!");
		} else {
			System.out.println("The game is a tie!");
		}
		
	}

}
