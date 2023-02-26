

public class IBIOQ84 {


public static int gcd(int a, int b) {
   
for (int i = 0; a != b; i++) {   
    if (b > a) {
        b = b - a;
  
    } else if (a > b){
		a = a - b; 
		
	}
}
    return a;
}


	public static void main (String[] args) {
		
		int a = 36; 
		int b = 27; 
		System.out.println("The GDC of " + a + " and " + b + " is " + gcd(a,b));
		
		
		
}

}

