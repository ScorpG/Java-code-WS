public class IBIOQ16

{
public static void main(String args[]) 
{ 
	int T = IBIO.inputInt("How many terms? "); 
	int n1 = 0;
	int n2 = 1;
	IBIO.output(n1);
	IBIO.output(n2);
	int n3 = 0;
	
	for (int i = 0;i <= T; i++) 
	{	
		n3 = n1 + n2; 
		IBIO.output(n3);  
		n1=n2;  
		n2=n3; 
		

}
}
}
