public class Mocktest

{
	public static void main(String args[]) 
	{
 IBIO.output ("Avi");
 
 int n = IBIO.inputInt("Calculate up to term? (n)");
 
 do
 {
 
	while(n < 0)
	{	IBIO.output("Error.Enter a positive number"); 
		IBIO.inputInt("Calculate up to term? (n) ");
	}
		long prev = 0;
		long next = 1;
		long fibo = 0;
		double average = prev + next;
		if (n <= 20);
		{
		IBIO.out(prev + "; " + next);
	}
		for(int i = 2;i <= n; i++) 
		{
			 fibo = prev + next;
			average = average + fibo;
			if(n<=20);
			{IBIO.out("; " + fibo);
			}
		prev = next;
		next = fibo;
		
	}
	fibo = prev + next; //calculate the last term only 
	if(n <= 20)
	{IBIO.out("; ");
	}
	IBIO.output(fibo);
	IBIO.out("Average: " + (average/n));
	long r = fibo;
	int digitcounter = 0;
	do 
	{ r = r / 10; 
		digitcounter( 
	}
	
}
