package SportsData.CodingChallenge;

public class Card {

//	instance variables
	private CardValue value;
	private Suit suit;
	
	
	
//	getters and setters
	public CardValue getCardValue() {
		
		return value;
	}



	public void setCardValue(CardValue value) {
		
		this.value = value;
	}



	public Suit getSuit() {
		
		return suit;
	}



	public void setSuit(Suit suit) {
		
		this.suit = suit;
	}

	
	
//	methods
	public enum CardValue {
		
		ACE(1),
		TWO(2),
		THREE(3),
		FOUR(4),
		FIVE(5),
		SIX(6),
		SEVEN(7),
		EIGHT(8),
		NINE(9),
		TEN(10),
		JACK(11),
		QUEEN(12),
		KING(13);
		
		
//		enum instance variable
		private int number;
		
//		enum constructor
		private CardValue(int number) {
			
			this.number = number;
		}
		
//		enum getter
		public int getCardValue() {
			
			return number;
		}
	}
	
	public enum Suit {
		
		Hearts,
		Diamonds,
		Clubs,
		Spades;
	}

	
	
//	constructor
	public Card (CardValue value, Suit suit) {
		
		this.value = value;
		this.suit = suit;
	}
}
