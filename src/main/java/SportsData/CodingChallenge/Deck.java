package SportsData.CodingChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import SportsData.CodingChallenge.Card.CardValue;
import SportsData.CodingChallenge.Card.Suit;

public class Deck {
	
//	instance variables
	private ArrayList<Card> thisDeck;
	
	
//	methods
	
	private void deckBuilder() {
		
		this.thisDeck = new ArrayList<Card>();
		
		for(int i=0; i < 4; i++) {
			
			Suit suit = Suit.values()[i];
			
			for(int j=0; j < 13; j++) {
				
				Card thisCard = new Card(CardValue.values()[j], suit);
				this.thisDeck.add(thisCard);
			}
		}
	}
	
	public void shuffleDeck() {
		
		Collections.shuffle(thisDeck);
	}
	
	public void drawNext() {

			System.out.println("\n" + thisDeck.get(0).getCardValue() + " of " + thisDeck.get(0).getSuit());
			thisDeck.remove(thisDeck.get(0));
			System.out.println("The deck has " + thisDeck.size() + " cards left!");
			
	}
	
	public void displayRemaining() {
		
		System.out.println("\nThe deck has " + thisDeck.size() + " cards left!");
		
		for(int k = 0; k < thisDeck.size(); k++) {
			
			System.out.println(thisDeck.get(k).getCardValue() + " of " + thisDeck.get(k).getSuit());	
		}
	}


	//	constructor
	public Deck() {
		
		deckBuilder();
		
	}
}
