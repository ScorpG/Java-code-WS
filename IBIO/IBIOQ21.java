
public class IBIOQ21 {
	
	public static void main (String[] args) {
		
		int n  = IBIO.inputInt("Number: ");
		
		if ( n< 50){
			
		IBIO.output("The number is  lower than 50");
	}
		else if (n>60){
			
			IBIO.output("The number is higher than 60");
		} 
		else if (50 < n) {
			
			if ( n < 60){ 
			IBIO.output("The number is inbetween 50 and 60");
		}
		}
	}
}

