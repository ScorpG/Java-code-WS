class TestIfElse
{
	public static void main(String args[])
	{
		int p = IBIO.inputInt("Input grade on a scale of a hundred:" );
		
		if(p >= 75)
			{
			IBIO.out("Passed");
			}
		else
			{
			IBIO.out("Please attempt again!");
			}
	}	
}


