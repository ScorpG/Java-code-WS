
public class IBIOQ82
	{
 public static void main(String args[])
   {
	   //int dup = 0;
	   //int ans = 0;
	 
for (int i = 1; i < 200 ;i++)

{ for(int j = 1; j < i ;j++)
	
{ for(int k = 1; k < i ;k++)	
	
{ for (int f = 1; f < k;f++)
	
	{if (good(i,j) && good(j,k) && good(i,k) && good(f,j) && good (f,k) && good(i,f) )
	

	System.out.println(i+" "+j+" "+k+" "+f);
	//else System.out.println("np");
	//IBIO.output(f);
//ans = i+j+k+f; 

////IBIO.output(ans);

//if (ans == dup) 
//{
	////IBIO.output("No");
		
//} else 
//{
	
	//IBIO.output(i+" "+j+" "+k+" "+f);
//}

//dup = ans;

//}


}
}
}
}
}
static boolean good(int a, int b) 
{ int x=a*b+1;
int y = (int) (Math.sqrt(x)+.5);
      return ( y * y == x );
   }

}
