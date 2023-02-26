

public class IBIOQ34 {
	
	public static void main (String[] args) {
		
		int a = IBIO.inputInt("Enter a number: ");
		int c = 0;
	IBIO.output(a);
	do 	{
	if (a%2 == 0){
	a = a/2;
	c++;
	IBIO.output(a);
}else {

	a = a * 3 + 1;
	c++;
	IBIO.output(a);
}
} while ( a > 1);
 IBIO.output("It took " + c +" times to reach 1");

		
	}
}

