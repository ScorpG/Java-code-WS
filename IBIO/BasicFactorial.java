
public class BasicFactorial 
{
	
	public static long factorial (int n){
		{if (n==0) 
			{return 1;
			}
			return n * factorial (n - 1); 
		}
	}
	
	
	public static void main (String[] args) 
	{
		IBIO.out(factorial(0));

	}

}

