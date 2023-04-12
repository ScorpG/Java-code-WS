public class IBIOQ95{
		
		public final static int SIZE = 1000;
	
	public static void main(String[] args) {
		int [] x = new int [SIZE];
		int v = 0;  
		int f; 
	int c = 0;
		for (int i = 2; i < 13; i++) 
		{	
			 
			 IBIO.output("");
			 f = 0;
			 
			for (int a = 1; a < SIZE;a++){
			 
			v = ran(6) + ran (6); 
			
			if (v == i){
				f = f + 1;
			}
			
			}
			IBIO.out( i + ":");
			for (int g = 0; g < f + 1; g++){
		IBIO.out("x");
		 c = c +1; 
	}
	
		}
		
		IBIO.out(c);
		//int[] num = new int[100]; // create the array
		
	//for (int i = 0; i < 100; i++)
//{ num[i] = ran(6);
   //}
	//for (int i = 0; i < 100; i++)
      //IBIO.output(num[i]);
		
	//} 

}
	public static int ran(int x) {
	return (int)(Math.random() * 6) + 1;
}

}
