package com.wnterrmute.cardgames.type52.entity.fiftytwocard;

import java.util.Stack;

import com.wnterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardRank;
import com.wnterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardSuite;

public abstract class FiftyTwoCardDeckImpl extends Stack<FiftyTwoCard> implements FiftyTwoCardDeck
{

	private boolean deckPrinted = false;
	
	public FiftyTwoCardDeckImpl() {
		deckPrinted = printDeck();
	}
	
	

}
