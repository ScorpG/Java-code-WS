

public class IBIOQ43 {
	
	public static void main (String[] args) 
	{
		int b;
		int c =0;
		int d = 0;
		int a;
		
		Loop2:do{
		a = IBIO.inputInt("Enter a number less than 1000: ");
		

			for(b = 1;b < a ; b++){
				
		for (c =1; c < a; c++ ){
			
			
			if ((b*b)+(c*c)==a){
				
			IBIO.output("The addition of the square of " + b + " and " + c + " equals " + a);
		}
			
		}
	}
			if ((b*b)+(c*c)!=a){
				IBIO.output("Impossible");
				break Loop2;
			}
			
		} while (a >= 999);
		
}
}


