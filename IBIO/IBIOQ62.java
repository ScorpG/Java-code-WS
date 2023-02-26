public class IBIOQ62 {
	
		
//}
////}

public static void main(String[] args)
{ 
	int num = IBIO.inputInt("Enter number of lines: ");
	String aa = stars(num);
	//String bb = starss(num);
	
	for (int i = 0; i < (num); i++) IBIO.output(stars(i));
	
	for (int i = (num); i >= 0 ; i--) IBIO.output(stars(i));

} //((num*2) - 1)

	static String stars(int n) { 
		String xx = "";
	for ( int i = 0; i <= n; i++)
	//if ( i > n){
		
		//xx = xx - "*";
		//return xx;
		
	//}
		xx = xx + "*";
		return xx; 
	
}
	
	
}

	
		//String xx = "*****";
		//int i = n;
	//for (i = i; i >= 0; i--)  
		//xx = xx + "*";
		//return xx;

	//int x;
	//for (x = 0; x == (n - 1); x++) 
	//IBIO.output(starss(x));
 
	//static String starss(int n) {
		 
		//String xx = "";
		//int u = n -1;
	//for ( u = u; u <= 0; u--) 
		//xx = xx - "*";
	//return xx; 






	

