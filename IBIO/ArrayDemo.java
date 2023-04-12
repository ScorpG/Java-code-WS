public class ArrayDemo 
{
	private static final int MAXSIZE = IBIO.inputInt("Enter array length: ");
	
	public static void printArray(int[] array)
	{
		if(array.length > 0)
		{	for(int index = 0; index < array.length; index++)
			{	System.out.println("[" + index + "] " + array[index]);
			}
		} else {
			System.out.println("Error: Nothing inside of the array");
			
		} 
	}
	
	
	// input into the array
	public static void inputArray(int[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			System.out.print("Enter integer #" + (index+1) + ": ");
			array[index] = IBIO.inputInt();
			printArray(array);
		}
	}
	
	public static double averageArray(int[] array)
	{
		double average = 0;
		for(int i = 0; i < array.length; i++)
		{
			average = average + array[i];
		}
		average = average / array.length;
		return average;
	}
	
	public static void main (String[] args)
	{
		int[] numbers; 
		numbers = new int[MAXSIZE]; 
		//System.out.println(numbers);
		printArray(numbers);
		inputArray(numbers);
		double average = averageArray(numbers) ;
		System.out.println( "Average = " + average );
		if(average == 0){
			
			System.out.println("Nothing inside of the array");
			
		}
	}
}
