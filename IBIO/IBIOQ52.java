
public class IBIOQ52 {
	
	public static void main (String[] args) {
	
	
	double term; 
	double sum = 0;
	double var = 1;
		
	for (int i = 1; i < 100; i++) { 
		term = var /(i*i);
		sum = sum + term;
	}
	IBIO.output("The total is " + sum);
	
		
	}
}

