/*
 * Q3PAnswer.java
 * 
 * Java programming practical test
 * Topic: Arrays, algorithms, problem solving
 * 
 */
import java.util.*;

public class Q3PAnswer
{	
	public static int max(int[] a)
	{
		int max = a[0];
		for(int i = 1; i < a.length; i++)
		{	int c = a[i];
			if(c > max)
			{	max = c;
			}
		}
		return max;
	}
	
	public static int min(int[] a)
	{
		int min = a[0];
		for(int i = 1; i < a.length; i++)
		{	int c = a[i];
			if(c < min)
			{	min = c;
			}
		}
		return min;
	}
	
	public static double average(int[] a)
	{
		double avg = 0;
		for(int i = 0; i < a.length; i++)
		{	avg = avg + a[i];
		}
		return avg/a.length;
	}
	
	public static int above(int[] a)
	{
		int above = 0;
		double avg = average(a);
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > avg)
			{	above++;
			}
		}
		return above;
	}
	
	public static int below(int[] a)
	{
		int below = 0;
		double avg = average(a);
		for(int i = 0; i < a.length; i++)
		{	
			if(a[i] < avg)
			{	below++;
			}
		}
		return below;
	}
	
	public static boolean isUnique(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{	for(int j = 1; j < a.length; j++)
			{	if(a[i] == a[j] && i != j)
				{	return false;
				}
			}
		}
		return true;
	}
	
	public static void printArray(int[] a)
	{
		for( int i = 0; i < a.length; i++ )
		{	System.out.print(a[i]);
			if(i < a.length - 1)
			{	System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void largest(int[] a, int howMany)
	{
		int large1 = max(a); // first maximum
		int large2;
		System.out.print(large1 + " ");
		for(int i = 0; i < howMany-1; i++)
		{	large2 = a[0];
			for(int j = 1; j < a.length; j++)
			{	if(a[j] > large2 && a[j] < large1)
				{	large2 = a[j];
				}
			}
			System.out.print(large2 + " ");
			large1 = large2;
		}
	}
	
	public static void smallest(int[] a, int howMany)
	{
		int small1 = min(a); // first minimum
		int small2;
		System.out.print(small1 + " ");
		for(int i = 0; i < howMany-1; i++)
		{	small2 = a[0];
			for(int j = 1; j < a.length; j++)
			{	if(a[j] < small2 && a[j] > small1)
				{	small2 = a[j];
				}
			}
			System.out.print(small2 + " ");
			small1 = small2;
		}
	}
		
	public static void main (String[] args)
	{	// DO NOT CHANGE THE LINE BELOW v
		final int[] numbers = { 163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337, 461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47, 349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 113, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271, 373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 229, 397, 137, 317 };
		// DO NOT CHANGE THE LINE ABOVE ^
		
		// OUTPUT YOUR NAME HERE
		
		System.out.print("Amount of numbers (100): ");
		// OUTPUT THE AMOUNT OF NUMBERS IN THE ARRAY HERE -- DON'T JUST output(100)
		
		System.out.println();
		printArray(numbers);
		System.out.println();
		System.out.println( "Min            (2) = " + min(numbers) );
		System.out.println( "Max          (523) = " + max(numbers) );
		System.out.println( "Average   (235.96) = " + average(numbers) );
		System.out.println( "Above average (48) = " + above(numbers) );
		System.out.println( "Below average (52) = " + below(numbers) );
		System.out.println( "Array has only unique elements (true): " + isUnique(numbers) );
		System.out.println();
		System.out.print( "How many largest and smallest numbers to find (2~20)? " );
		int howMany = 0;
		// INPUT HOWMANY BELOW, AND VALIDATE THE INPUT PROPERLY
		
		
		
		largest(numbers, howMany);
		System.out.println();
		smallest(numbers, howMany);
		// the end.
	}
	
	/*****************************************************************************
	 * ALL IBIO methods are below, you may use them if you want.				 *
	 * Because they are already inside our clas, there is no need to prefix IBIO.*
	 * before the name of the method.											 *
	 ****************************************************************************/
	 
	static void output (String info)
	{	System.out.println(info);	}
	
	static void out (String info)
	{	System.out.print(info);	}
	
	static void output (char info)
	{	System.out.println(info);	}
	
	static void out (char info)
	{	System.out.print(info);	}
	
	static void output (byte info)
	{	System.out.println(info);	}
	
	static void output (int info)
	{	System.out.println(info);	}
	
	static void out (int info)
	{	System.out.print(info);	}
	
	static void output (long info)
	{	System.out.println(info);	}
	
	static void out (long info)
	{	System.out.print(info);	}
	
	static void output (double info)
	{	System.out.println(info);	}
	
	static void output (boolean info)
	{	System.out.println(info);	}
	
	static String input(String prompt)
	{	String	inputLine = "";
		System.out.print(prompt);
		try
		{	inputLine = (new java.io.BufferedReader(
							new java.io.InputStreamReader(System.in))).readLine();}
		catch (Exception e)
		{	String	err = e.toString();
			System.out.println(err);
			inputLine = "";
		}
		return	inputLine;
	}
		
	static String inputString(String prompt)
	{	return	input(prompt);	}

	static String input()
	{	return	input("");	}


	static char inputChar(String prompt)
	{	char	result = (char) 0;
		try
		{	result = input(prompt).charAt(0);}
		catch (Exception e)	{	result = (char) 0;}
		return	result;
	}

	static byte inputByte(String prompt)
	{	byte	result = 0;
		try
		{	result = Byte.valueOf(input(prompt).trim()).byteValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static byte inputByte()
	{	return	inputByte("");	}

	static int inputInt(String prompt)
	{	int	result = 0;
		try
		{	result = Integer.valueOf(input(prompt).trim()).intValue() ;	}
		catch (Exception e)	{	System.out.println(">>> error in input"); result = 0;}
		return	result;
	}

	static int inputInt()
	{	return	inputInt("");
	}
	
	static long inputLong(String prompt)
	{	long	result = 0;
		try
		{	result = Long.valueOf(input(prompt).trim()).longValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static long inputLong()
	{	return	inputLong("");	}
	
	static double inputDouble(String prompt)
	{	double	result = 0;
		try
		{	result = Double.valueOf(input(prompt).trim()).doubleValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static double inputDouble()
	{	return	inputDouble("");	}
	
	static boolean inputBoolean(String prompt)
	{	boolean	result = false;
		try
		{	result = Boolean.valueOf(input(prompt).trim()).booleanValue() ;	}
		catch (Exception e)	{	result = false;}
		return	result;
	}

	static boolean inputBoolean()
	{	return	inputBoolean("");
	}
	
}
