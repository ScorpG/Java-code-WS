

public class IBIOQ32 {
	
	public static void main (String[] args) {
		int i = 1;
		int x = 0;
	do {
    x = IBIO.inputInt("Enter a number: ");
}
  while (x <= 1);
	do
	{ i++;
	} while (x % i != 0);
   IBIO.output(x + " is divisible by " + i);
   
   
   if (i == x || i == 1)
   {
	   IBIO.output("Prime");
   }
   else {
	   IBIO.output("Not a prime");
	   
   }
	}
}


