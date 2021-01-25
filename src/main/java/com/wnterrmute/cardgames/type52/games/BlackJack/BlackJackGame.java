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
	
	boolean newHand = true;
	
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

	// I know this does not reflect proper deal order (p,d,p,d ) but the requirements do not mention deal order, and I am not going to bring my 
	// person knowledge into those requirements 
	// the same reason I didn't add a shuffle.. . there is no requirement for it
	private void PlayHand() {
		p1value = player.newHand();
		dlValue = dealer.newHand();
		boolean foundWinner = false;
		newHand = false;
		// the unlikely case of a 21 for either or both
		if( plValue == dlValue && pValue == 21 ) {
			printResult("Both win: Push" );
			newHand = true;
		}
		else if ( plValue == 21 ) {
			printResult("Player Wins" );
			newHand = true;
		}
		else if (dlValue == 21 ){
			printResult("Dealer Wins" );
			newHand = true;
		}
		if (newHand)
			return;
		while (! newHand ) {
			if( p1Value < 16 ) {
				p1Value = p1Value + player.playHand();
			}
			if( plValue == 21 ) {
				printResult("Player Wins" );
				newHand = true;		
				foundWinnder = true;
				
			}
			if( plValue > 21 ) {
				printResult("Dealer Wins" );
				newHand = true;
				foundWinnder = true;
			}
			dlValue = dlValue + dealer.playHand();
			if( dlValue == 21 ) {
				printResult("Dealer Wins" );
				newHand = true;		
				foundWinnder = true;
				
			}
			if( plValue > 21 ) {
				printResult("Player Wins" );
				newHand = true;
				foundWinnder = true;
			}

 		}
	}
	public void printStats() {
		// TODO Auto-generated method stub
		
	}
	
	private void printEnd() {
		
	}
	
	private String showResult( String msg ) {
		System.out.print( "Result: " + msg );
	}
	

	public BlackJackCard getCard() {
		// TODO Auto-generated method stub
		BlackJackCard cardToDeal = shoe.dealCard();
		if(  cardToDeal == null )
		{
			printEnd();
		}
		return shoe.dealCard();
		
	}
	
	public Play() {
		
	}

	
}
