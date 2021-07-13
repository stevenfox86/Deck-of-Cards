package SportsData.CodingChallenge;

import java.util.Scanner;

public class Main {

	static Deck theDeck = new Deck();
	static Scanner in = new Scanner(System.in);
	static String choice = "";


	public static void greeting() {
		System.out.println("Welcome to the Deck of Cards Coding Challenge!");
	}
	
	public static void options() {
		System.out.println("\nPlease choose from the following options:");
		System.out.println("Q) – quit the application");
		System.out.println("N) – get a new deck");
		System.out.println("S) – shuffle the current deck");
		System.out.println("D) – draw next card from current deck");
		System.out.println("R) – display the cards remaining in the deck");
	}
	
	public static String getChoice() {
		
		choice = "";
			
		String input = in.next();
			
		System.out.println(input);
			
		choice = input;
		
		return choice;
	}
	
	public static void play(String choice) {
		
		if(choice.equalsIgnoreCase("Q")) {
			System.out.println("\nThank you for playing the Deck of Cards Coding Challange!!!");
			in.close();
			System.exit(1);
		
		} else if(choice.equalsIgnoreCase("N")) {
		
			theDeck = new Deck();
			System.out.println("\nA new deck has been created!");
		
		} else if(choice.equalsIgnoreCase("S")) {
		
			theDeck.shuffleDeck();
			System.out.println("\nThe deck has been shuffled!");
		
		} else if(choice.equalsIgnoreCase("D")) {
		
			theDeck.drawNext();
	
		} else if(choice.equalsIgnoreCase("R")) {
		
			theDeck.displayRemaining();
		}
	}
	
	public static void main(String[] args) {
		greeting();
		
		while (!choice.equalsIgnoreCase("Q")) {
			options();
			getChoice();
			play(choice);		
		}
	}
}
