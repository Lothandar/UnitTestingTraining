package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingTraining {

	private BlackJack jack = new BlackJack();
	
	@Test
	public void test() 
	{
		assertEquals("Highest number didn't win", 21 , jack.play(10,  21));
	}
	@Test
	public void testOneBust() 
	{
		assertEquals("Player has bust but still won", 21 , jack.play(22, 21));
	}
	@Test
	public void testSecondBust() 
	{
		assertEquals("Player has bust but still won", 21 , jack.play(2, 22));
	}
	@Test
	public void TestBothBust()
	{
		assertEquals("Both Player have bust but one still one", 0, jack.play(22, 22));
	}
}