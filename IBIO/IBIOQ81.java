public class IBIOQ81
{
 public static void main(String args[])
   {
	   int dup = 0;
	   int ans = 0;
	 
for (int i = 1; i < 100 ;i++)

{ for(int j = 1; j < i ;j++)
	
{ for(int k = 1; k < i ;k++)
	
	
{ if ( good(i,j) && good(j,k) && good(i,k) )
	

	
ans = i+j+k; 

//IBIO.output(ans);

if (ans == dup) 
{
	//IBIO.output("No");
		
} else 
{
	
	IBIO.output(i+" "+j+" "+k);
}

dup = ans;

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
