package wargametest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import wargame.Card;
import wargame.CardDeck;

public class CardDeck_Test {


	@Test
	public void testGetnumber() {
		CardDeck cd = new CardDeck();
		assertEquals(cd.getnumber(),52);
	}

	@Test
	public void testShuffle() {
		CardDeck cd = new CardDeck();
		CardDeck original = cd;
		cd.shuffle();
		assertNotEquals(original.deal(),cd.deal());
	}

	@Test
	public void testDeal() {
		CardDeck cd = new CardDeck();
		Card c = cd.deal();
		Card d = new Card(13,4);
		assertTrue(c.equals(d));
		assertEquals(cd.getnumber(),51);
	}

}
