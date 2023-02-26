

public class IBIOQ54 {
	
	public static void main (String[] args) {
		 
		
	double sum = 0;
	double div = 1;
	double fra = 1;
	double term = 0;
	int dw = 0;
	int dw2=0;
		
	for (int i = 1; i <= 100; i++) { 
		
		
	
      sum = sum + term;
      fra=fra*i;
      div=div+2;
      term = fra/div;
      //up = fra + 1; 
	//fra = fra * up;
      
      //dw = div + 2;
      //div = div * dw;
      
      	IBIO.output(sum);
	}
	IBIO.output("The total is " + 2*sum);
		
		
	}
}

