public class IBIOloop
{

	public static void main (String args[])
	{	
		int	number = IBIO.inputInt("Enter the starting number");
		for (int i = 0; i < 20; i++)	
		{	
			number = number + 7; 
			IBIO.output (number);
		}
	}

}


