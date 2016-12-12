package wargametest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import wargame.Card;
import wargame.cardStack;

public class cardStack_Test {


	@Test
	public void testGetnumber() {
		cardStack c = new cardStack();
		assertEquals(c.getnumber(),0);
	}

	@Test
	public void testNextCard() {
		cardStack c = new cardStack();
		assertNull(c.nextCard());
	}

	@Test
	public void testClear() {
		cardStack c = new cardStack();
		Card a = new Card(1,5);
		c.addCard(a);
		c.clear();
		assertNull(c.nextCard());
		assertEquals(c.getnumber(),0);
		
	}

	@Test
	public void testAddCard() {
		cardStack c = new cardStack();
		Card a = new Card(1,5);
		c.addCard(a);
		assertEquals(c.getnumber(),1);
		assertEquals(c.nextCard(),a);
		
	}

	@Test
	public void testAddCards() {
		Card a1 = new Card(1,5);
		Card a2 = new Card(1,5);
		cardStack c = new cardStack();
		cardStack b = new cardStack();
		b.addCard(a1);
		b.addCard(a2);
		c.addCards(b);
		assertEquals(c.nextCard(),a1);
		assertEquals(c.nextCard(),a2);
	}

}
