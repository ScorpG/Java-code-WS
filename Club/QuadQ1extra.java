
import java.util.Scanner;  
public class QuadQ1extra 
{  
public static void main(String[] Strings)   
{  
	double a;
	double b;
	double c;
	double r1;
	double r2;
	
Scanner input = new Scanner(System.in);  

System.out.print("Enter the value of a: ");  
a = input.nextDouble();
System.out.print("Enter the value of b: ");
b = input.nextDouble();  
System.out.print("Enter the value of c: ");
c = input.nextDouble();  

double d= b * b - (4 * a * c);  
if (d > 0) {  
r1 = (-b + Math.pow(d, 0.5)) / (2 * a);  
r2 = (-b - Math.pow(d, 0.5)) / (2 * a);  
System.out.println("The roots are " + r1 + " and " + r2);  
}   
else if (d == 0)   
{  
r1 = -b / (2 * a);  
System.out.println("The root is " + r1);  
}   
else 
{
	System.out.println("There are no roots.");    
}  
}
}  
