
public class IBIOQ51 {
	
	public static void main (String[] args) {
		
		double term = 1; 
		double sum = 0;
		for (int i = 0; i < 100; i++) { 
		sum = sum + term;
		term = term / 5;
	}
	sum = sum - 1;
	IBIO.output("The total is " + sum);

	}
}

