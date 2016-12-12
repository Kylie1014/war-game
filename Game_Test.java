package wargametest;

import static org.junit.Assert.*;

import org.junit.Test;

import wargame.Game;
import wargame.Player;

public class Game_Test {

	@Test
	public void testGetWinner() {
		Game g = new Game();
		g.play();
		Player p = g.getWinner();
	}

	@Test
	public void testPlay() {
		Game g = new Game();
		g.play();
	}

}
