public class Insertionsort{
	
public static void main(String[] args) {
	
    int[] numbers = new int[IBIO.inputInt("Array length: ")];

	for (int h = 0; h < numbers.length; h++){
		numbers[h] = IBIO.inputInt("Number: ");}

//for(int i = 0; i < numbers.length; i++){
	
	//for (int j = 0; j < numbers.length; j++){
		
		//if (numbers[j] < numbers[i]){
		//int temp = numbers[j]; 
			
	//for(int y = 1; y <= numbers.length; y++){
		
		//for(int x = 0; x <= numbers.length;x++){
			
		//numbers[i+y] = numbers[i+x]; 
	//}
//}

		//numbers[i] = temp; 
		//break;  
	//}
		for (int i = 1; i < numbers.length; i++) {
        int key = numbers[i];
        int j = i - 1;
        while (j >= 0 && numbers[j] > key) {
            numbers[j + 1] = numbers[j];
            j--;
        }
        numbers[j + 1] = key;
        
         for (int m = 0; m < numbers.length ; m++) {
        System.out.print(numbers[m] + " ");
        
    }
    
    for (int m = 0; m < numbers.length ; m++) {
        System.out.print(numbers[m] + " ");
}
	
	}
}
}



