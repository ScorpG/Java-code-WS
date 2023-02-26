public class ex3
{
	public static void main(String args[]) 
	
{
	int n = IBIO.inputInt("Please give a number: ");
	int c = 0; 
	IBIO.output("" +n);
	
	for (int i = 0; n > 1; i++)
	{
		c++;
		if (n % 2 ==0)
			{
				n = n / 2; 
			IBIO.output(""+ n);

			}
		else
			{
			n = (n * 3) + 1;
			IBIO.output(""+ n);
			}
		}
	IBIO.output("It takes "+ c +" steps to reach 1");
}
}
