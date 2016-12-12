package wargametest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import wargame.Card;
import wargame.Player;
import wargame.cardStack;

public class Player_Test {


	@Test
	public void testNumCards() {
		Player p = new Player("jialin");
		assertEquals(p.numCards(),0);
	}

	@Test
	public void testGetname() {
		Player p = new Player("jialin");
		assertTrue(p.getname().equals("jialin"));
	}

	@Test
	public void testPlayCard() {
		Player p = new Player("jialin");
		assertNull(p.playCard());
		Card a = new Card(1,6);
		p.collectcard(a);
		assertEquals(p.playCard(),a);
	}

	@Test
	public void testCollectcard() {
		Player p = new Player("jialin");
		assertNull(p.playCard());
		Card a = new Card(1,6);
		p.collectcard(a);
		assertEquals(p.playCard(),a);
	}

	@Test
	public void testCollectcards() {
		Player p = new Player("jialin");
		assertNull(p.playCard());
		cardStack s = new cardStack();
		Card a = new Card(1,6);
		s.addCard(a);
		p.collectcards(s);
		assertEquals(p.playCard(),a);
	}

}
