
public class IBIOQ92 {
	
	public static void main (String[] args) {
		
		int[] num = new int[100]; // create the array
	for (int i = 0; i < 100; i++)
{ num[i] = ran(6);
   }
	for (int i = 0; i < 100; i++)
      IBIO.output(num[i]);
		
	} 


	public static int ran(int x) {
	return (int)(Math.random() * x) + 1;
}
}

