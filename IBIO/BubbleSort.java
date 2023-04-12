
public class BubbleSort {
		
		public static void main(String[] args) {
    int[] numbers = new int[IBIO.inputInt("Array length: ")];

   for (int h = 0; h < numbers.length; h++){
    numbers[h] = IBIO.inputInt("Number:");}
    
    bubblesort(numbers);
    
}

public static void bubblesort(int[] numbers){

    int x = numbers.length; 
     
    for ( int i = 0; i < x - 1; i++){
		
		 for ( int f = 0; f < x -1 - i; f++) {
		
		if (numbers[f] > numbers [f+1]){
			
		int temp = numbers[f];
		numbers [f] = numbers [f+1];
		numbers [f+1] = temp; 
		
	}
	} 
    }
    
     for (int m = 0; m < x; m++) {
        System.out.print(numbers[m] + " ");
}

		
		
		
}

}
