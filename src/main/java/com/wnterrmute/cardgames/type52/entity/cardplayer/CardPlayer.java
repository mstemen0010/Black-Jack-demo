/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wnterrmute.cardgames.type52.entity.cardplayer;

import com.wnterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard;

/**
 *
 * @author Mathias
 */
public abstract class CardPlayer {
	
	boolean dealer = false;
	
	public CardPlayer( boolean isDealer ) {
		dealer = isDealer;
	}
	
	public boolean isDealer () {
		return dealer;
	}
}
