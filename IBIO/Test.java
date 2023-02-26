/*
 * Template for a simple Java class with main method
 */

public class Test
{
	public static void main(String[] args)
	
	{
		IBIO.output ("Avijit Divaker");
		int s = 1;
		int p = 0; 
		int d = s;
			
		int a = IBIO.inputInt("Enter a number: ");
		
	if ( a <= 10)
	{
		if (1>a)
		{ 
			IBIO.output(">>> Error - Invalid input");
		} 
		
	
		for (int i = 0; i < a; i++)
		{
		IBIO.output(s); 
		p = s*s;
		IBIO.output(" " + p);
			for (int u = 0; u >= p ; u++)
			{
			a = a*p;
			}
		IBIO.output("  "+ a);
		s++;
		}
	}

	else 
	{
		IBIO.output(">>> Error - Invalid input");
	}
	}
}
