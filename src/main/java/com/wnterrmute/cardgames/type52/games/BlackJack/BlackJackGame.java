package com.wnterrmute.cardgames.type52.games.BlackJack;

import com.wnterrmute.cardgames.type52.entity.cardgame.CardGame;

public class BlackJackGame implements CardGame {

	BlackJackCardShoe shoe = new BlackJackCardShoe(6);
	BlackJackDeck deck1 = new BlackJackDeck();
	BlackJackDeck deck2 = new BlackJackDeck();
	BlackJackDeck deck3 = new BlackJackDeck();
	BlackJackDeck deck4 = new BlackJackDeck();
	BlackJackDeck deck5 = new BlackJackDeck();
	BlackJackDeck deck6 = new BlackJackDeck();
	BlackJackPlayer player = null;
	BlackJackPlayer dealer = null;
	
	
	
	public BlackJackGame() {
		deck1.printDeck();
		deck2.printDeck();
		deck3.printDeck();
		deck4.printDeck();
		deck5.printDeck();
		deck6.printDeck();
		shoe.addDeck(deck1);
		shoe.addDeck(deck2);
		shoe.addDeck(deck3);
		shoe.addDeck(deck4);
		shoe.addDeck(deck5);
		shoe.addDeck(deck6);
		
		player = new BlackJackPlayer( false, this );
		dealer = new  BlackJackPlayer( true, this );
	}
	
	@Override
	public int hit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printTurn() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void printStats() {
		// TODO Auto-generated method stub
		
	}

	public BlackJackCard getCard() {
		// TODO Auto-generated method stub
		return shoe.dealCard();
		
	}

	
}
