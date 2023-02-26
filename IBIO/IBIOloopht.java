public class IBIOloopht

{
	public static void main(String args[]) 
	{
 IBIO.output ("Avi");
 
 int n = IBIO.inputInt("Calculate up to term? (n)");
	do 
	{	IBIO.output("Error.Enter a positive number"); 
		IBIO.inputInt("Calculate up to term? (n) "); 
	}while (n < 0);
	IBIO.output("Good");
	
}
}
