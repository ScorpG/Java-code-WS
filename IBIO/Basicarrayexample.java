


public class Basicarrayexample{
	
	
	private static final int MAXSIZE = 4;
	
	public static void inputarray(int[] array) {
		
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter integer #" + index + ":");
			array [index] = IBIO.inputInt();
		
		
		
		//int[] array; 
		//array = new int [4];
		
		//array[0] = 10;
		//array[1] = 20; 
		//array[2] = 30; 
		//array[3] = 40;
		
		
	}
}
	
	public static void printArray(int[] array) {
		
		if (array.length > 0)
		{ for (int index = 0; index < array.length; index++) 
			{ System.out.println("[" + index + "]" + array[index]); 
			}
			
		}else {
			System.out.println("Nothing inside of number array");
		}
		
		
	}
	public static double averageArray(int[] array)
	{
		double average = 0;
		for(int index = 0; index < array.length; index++)
		{
			average = average + array[index];
		}
		average = average / array.length;
		return average;
	}
	
	
	
	
	public static void main (String[] args) {
		int[] numbers; // declaration
		numbers = new int[MAXSIZE]; // initialisation
		//System.out.println(numbers);
		printArray(numbers);
		inputarray(numbers);
		printArray(numbers);
		double average = averageArray(numbers) ;
		System.out.println( "Average = " + average );
		System.out.println();
		
	}
	
	
}


