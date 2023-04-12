public class IBIOQ91 {
	
	public	static	void	main(String	args[]){
	
	int t = 0;
	int a= 0;
	for(int i = 0; i < 100; i++)
	{ double xx = Math.random() * 6; //Math.random - decimal
	int yy = (int)(xx + 1); //change to number 1 to 6
	t = t + yy;
      IBIO.output(yy);
   }
	a = t/100;
	IBIO.output("Average: " + a);
	
}
}
