

public class IBIOQ42 
{
	
	public static void main (String[] args) 
	{ 
		int a = 1;
		int b = 0;
		int c = 0;
	do {
		b = a%3;
		switch (b){
			case 0:
			 b = a *-5;
			 c = c + b;
			 break;
			 case 1:
			 b = a*7;
			 c = c + b;
			 break;
			 case 2:
			 b = a *2;
			 c = c + b;
			 break;
		}
	a++;
		
	}while (a != 1001);
	
	IBIO.output(c);
}

}
