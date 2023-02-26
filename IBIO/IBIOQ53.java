

public class IBIOQ53 {
	
	public static void main (String[] args) {
		
	double term =1; 
	double sum = 0;
	double sign = -1;
	int div = 1;
	double fra;
		
	for (int i = 0; i < 10000; i++) { 
		
	fra= 1;
	fra = fra/div;
	sign = sign * -1;
	fra = sign * fra;
      sum = sum + fra;
      div = div + 2;
	}
	IBIO.output("The total is " + 4*sum);
		
		
	}
}

