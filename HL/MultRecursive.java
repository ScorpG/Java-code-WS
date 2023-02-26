import	java.util.Scanner;
public	class	MultRecursive
{
public	static	int	mult(int	a,	int	b)
{
	if(b==	0)
{		return	1;
}
else if(b == 1)
{ return	a;
}
else
{ return a*b;
}
	
}
				
public	static	void	main(String	args[])
{ Scanner	input	=	new	Scanner(System.in);
System.out.print("x = ");
int	x=	input.nextInt();
System.out.print("y = ");
int	y=	input.nextInt();
System.out.println(	"\n"+x+" * "+y+" = "+mult(x,y)	);
}
}
