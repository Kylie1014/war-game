package wargametest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import wargame.Card;

public class Card_Test { 

	@Test
	public void testGetRank() {
		Card a = new Card(1,3);
		assertEquals(1,a.getRank());
	}

	@Test
	public void testGetSuit() {
		Card a = new Card(1,3);
		assertEquals(3,a.getSuit());
	}

	@Test
	public void testCompareTo() {
		Card a = new Card(1,3);
		Card b = new Card(1,3);
		assertTrue(a.compareTo(b)==0);
	
	}

	public void testequals(){
		Card a = new Card(1,3);
		Card b = new Card(1,5);
		Card c = new Card(2,3);
		assertTrue(a.equals(b));
		assertTrue(!a.equals(c));
	}



}
