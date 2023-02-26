import	java.util.Scanner;
public	class	PowerRecursive
{
public	static	double	power(int	base,	int	exponent)
{
if(	exponent ==	0	)
{			return	1;
}
else	if(	exponent	==	1)
{ return	base;
} else
{ return	base	*	power(base,	exponent-1);
}
}
				
public	static	void	main(String	args[])


{ Scanner	input	=	new	Scanner(System.in);
System.out.print("Base =	");
int	x	=	input.nextInt();
System.out.print("Exponent = ");
int	y	=	input.nextInt();
if (y < 0){
	int a = x;
int b = (y*-1);
	System.out.println(	"\n"+x+" ^ "+y+" = "+1/power(a,b));
	
}else if (x < 0)
{
System.out.println(	"\n"+x+" ^ "+y+" = "+((1/power(x,-y))));
	//System.out.println(	"\n"+x+" ^ "+y+" = "+power(x,y)	);
}
	else {
		System.out.println(	"\n"+x+" ^ "+y+" = "+power(x,y));
		
	}
}
}



