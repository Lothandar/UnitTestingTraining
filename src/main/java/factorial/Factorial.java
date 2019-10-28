package factorial;

public class Factorial {

	public String Reverse(long a)
	{
	
		if(a == 1)
		{
			return  a + " = " + a +"!";
		}
		int i =  2;
		double b = a;
		while(true)
		{	
			b =b/i;
			//System.out.println(b);
			
			if(b <=1)
			{
				if(b == 1)
				{
					return  a + " = " + i +"!";
				}
				else
				{
					return "NONE";
				}
			}
			i++;
		}
	}
}
