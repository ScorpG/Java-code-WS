public class IBIOQ12

{
public static void main(String args[]) 
{ 
	int St = IBIO.inputInt("Step = ");
	int S = IBIO.inputInt("Start = ");
	int Inc = IBIO.inputInt("Increment = ");
	
	for (int i = 0; i < St; i++) 
	{ 	IBIO.output(S); 
		S = S+ Inc;
		
	}
}
}
