public class IBIOQ93 {
	
	public static void main (String[] args) {
		int v = 0; 
		int f; 
	
		for (int i = 1; i < 7; i++) 
		{	
			 
			 IBIO.output("");
			 f = 0;
			 
			for (int a = 0; a < 100;a++){
			 
			v = ran(6); 
			
			if (v == i){
				f = f + 1;
			}
			}
			for (int g = 0; g < f +1; g++){
		IBIO.out(i); 
	}
		}
		
		
		//int[] num = new int[100]; // create the array
		
	//for (int i = 0; i < 100; i++)
//{ num[i] = ran(6);
   //}
	//for (int i = 0; i < 100; i++)
      //IBIO.output(num[i]);
		
	//} 

}
	public static int ran(int x) {
	return (int)(Math.random() * 6)+1;
}

}
