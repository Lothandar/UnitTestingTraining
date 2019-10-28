package factorial;


import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTesting {

	private Factorial fac = new Factorial();
	
	@Test
	public void Reverse120()
	{
		assertEquals("Reverse factorial not working", "120 = 5!", fac.Reverse(120));
	}
	@Test
	public void TestingNONE()
	{
		assertEquals("Reverse factorial not working", "NONE", fac.Reverse(150));
	}
	@Test
	public void TestingBigNumber()
	{
		assertEquals("Reverse factorial not working", "3628800 = 10!", fac.Reverse(3628800));
	}
	@Test
	public void TestingDouble()
	{
		assertEquals("Reverse factorial not working", "479001600 = 12!", fac.Reverse(479001600));
	}
	@Test
	public void TestingSix()
	{
		assertEquals("Reverse factorial not working", "6 = 3!", fac.Reverse(6));
	}
	@Test
	public void Testing18()
	{
		assertEquals("Reverse factorial not working", "NONE", fac.Reverse(18));
	}
	@Test
	public void TestingAuto()
	{
		for(long j = 1; j <= Long.MAX_VALUE; j++)
		{
			for(int i = 1; i <= 20; i++)
			{
				if(Factorial(i) == j)
				{
					assertEquals("Reverse factorial not working", j+" = "+ i+ "!", fac.Reverse(j));
					break;
				}
				else if (i == 20)
				{
					assertEquals("Reverse factorial not working", "NONE", fac.Reverse(j));
				}
			}
		}
	}
	public long Factorial(int a)
	{
		int i = 1; 
		long fact = 1;
		for(i=1;i<= a;i++){    
		      fact=fact*i;    
		  }    
		return fact;
	}
}
