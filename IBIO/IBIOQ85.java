

public class IBIOQ85 {
	
	public static void main (String[] args) {
	
for (int a = 1; a < 100; a++) {
for (int b = 1; b < a; b++) {
int c = (int) Math.sqrt(a * a + b * b);
if (c * c == a * a + b * b && c < 100) {
	
if (gcd(a,b) > 1) {
	
	//System.out.println("Nope");
	
} else {

System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
}
}
}
}
}
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


} 

