public class SelectionSort {
	
	public static void main(String[] args) {
    int[] numbers = new int[IBIO.inputInt("Array length: ")];

	for (int h = 0; h < numbers.length; h++){
		numbers[h] = IBIO.inputInt("Number: ");}

int min, temp = 0; 

	for(int i = 0; i < numbers.length -1 ; i++){ 

	min = i; 
	
	for ( int n = i +1; n < numbers.length ; n++){
	if (numbers[min] > numbers[n]){
		
		min = n;
	}
	
}
	temp = numbers[min]; 
	numbers[min] = numbers[i];
	numbers[i] = temp;
	
}

    for (int m = 0; m < numbers.length ; m++) {
        System.out.print(numbers[m] + " ");


}

}
}
