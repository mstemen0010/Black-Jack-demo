package com.wnterrmute.cardgames.type52.games.BlackJack;

import java.util.Stack;

import com.wnterrmute.cardgames.type52.games.BlackJack.BlackJackGame;
import com.wnterrmute.cardgames.type52.entity.cardplayer.CardPlayer;
import com.wnterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard;
import com.wnterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardRank;

public class BlackJackPlayer extends CardPlayer  {
	
	
	BlackJackGame currGame = null; 
	Stack<BlackJackCard> hand = new Stack<>();
	int handTotal = 0;
	boolean hasAce = false;

	public BlackJackPlayer(boolean isDealer, BlackJackGame curGame) {
		super(isDealer);
		// TODO Auto-generated constructor stub
	}
	
	public int newHand() {
		BlackJackCard card1 = currGame.getCard();
		BlackJackCard card2 = currGame.getCard();
		int card1Val = card1.getRank().getValue();
		int card2Val = card2.getRank().getValue();
		
		if( card1Val == 10 &&  card2.getRank()== PlayCardRank.Ace ) {
			handTotal= 21;
			hasAce = true; /// for completeness 
		}
		else if ( card2Val == 10 &&  card1.getRank()== PlayCardRank.Ace ) {
			handTotal = 21;
			hasAce = true;
		}
		else {
			if( card1.getRank() == PlayCardRank.Ace )
			{
				hasAce = true;
				handTotal = card2Val + 1;
			}
			else if( card2.getRank() == PlayCardRank.Ace) {
				hasAce = true;
				handTotal = card1Val + 1;
			}
			else {
				handTotal = card1Val + card2Val;
			}
		}
		
		return handTotal;
	}
	public int playHand()  {
		BlackJackCard card1 = null;
		int card1Val = 0;
		if( ! super.isDealer() ) {
			if ( handTotal < 16 ) {
				card1 = currGame.getCard();
				card1Val = card1.getRank().getValue();
			}
			if( card1.getRank()== PlayCardRank.Ace ) {
				
			}
		}
		return handTotal;
	}

}
