public class Test2real {
	
	public static void main (String[] args) {
		
		IBIO.output("Avi");
		
	int a = IBIO.inputInt("How many numbers to process?: ");
	int count = 0;
	double num = 0;
	int b = 0;
	double min = 999999999;
	double max = 0 ;
	double ran=0;
	double ev =0;
	double od =0;
		
		
		if (a<=2){
			
			IBIO.output("Input Error!");
			
		} else {

		do {
			int c = IBIO.inputInt("Enter number: ");
			count++;
			
			if (c<min){
				
				min = c;
				
			}
			
			if (c>a||c>max){
				
				max = c;
				
			}
			num = num + c;
			
			
		if(c%2 == 0)
		{	
			ev++;
		}	
		if(c%2 != 0)
		{	
			od++;
		}
			
			
		}while (count != a);
		
		ran = max - min;
		
		IBIO.output("Minimum: "+ min);
		
		IBIO.output("Maximum: "+max);
		
		IBIO.output("Range: "+ran);
		
		IBIO.output("Average: "+ num/a);
		
		IBIO.output("Evens: "+ev);
		
		IBIO.output("Odds: "+od);
	}
}
}

