
import java.util.Scanner;

public class ArrayStack1 {
	int[] stack = new int[10];
		int top = -1; // initialize the top of the stack to -1
		//int x = scanner.nextInt();
	Scanner scanner = new Scanner(System.in);
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
		
		
		//int[] stack = new int[10];
		//int top = -1; // initialize the top of the stack to -1
		
	}
	public void push(int element) throws Exception {
    if (top == stack.length - 1) {
        throw new Exception("Stack is full");
    }
    top++;
    stack[top] = element;
}
public int pop() throws Exception {
    if (top == -1) {
        throw new Exception("Stack is empty");
    }
    int element = stack[top];
    top--;
    return element;
}
public int peek() throws Exception {
    if (top == -1) {
        throw new Exception("Stack is empty");
    }
    return stack[top];
}

private static final int MAXSIZE = 10;
	
	public static void inputarray(int[] array) {
		
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter number #" + index + ":");
			array [index] = IBIO.inputInt();
		

		//array [index] = parseInt(index);
		
		
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
	
	
	
	
	//public static void main (String[] args) {
		//int[] numbers; // declaration
		//numbers = new int[MAXSIZE]; // initialisation
		////System.out.println(numbers);
		//printArray(numbers);
		//inputarray(numbers);
		//printArray(numbers);
		//double average = averageArray(numbers) ;
		//System.out.println( "Average = " + average );
		//System.out.println();
		
	//}
}
