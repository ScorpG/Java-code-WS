import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    private int[] arr;
    private int size;
    private int capacity;
    
  
    public MyArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    
   
    public int length() {
        return this.size;
    }
    
  
    public boolean isEmpty() {
        return this.size == 0;
    }
    
   
    public boolean isFull() {
        return this.size == this.capacity;
    }
    
   
    public void printArray() {
        System.out.println(Arrays.toString(this.arr));
    }
    
    // Method to print the populated part of the array
    public void printPopulated() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(this.arr, 0, this.size)));
    }
    
    
    public MyArray clone() {
        MyArray clonedArray = new MyArray(this.capacity);
        clonedArray.arr = Arrays.copyOf(this.arr, this.capacity);
        clonedArray.size = this.size;
        return clonedArray;
    }
    
    
    public void add(int element) {
        if (this.isFull()) {
            System.out.println("Array is full, cannot add element");
            return;
        }
        this.arr[this.size] = element;
        this.size++;
    }
    
    
    public void append(int[] otherArray) {
        int availableSpace = this.capacity - this.size;
        if (otherArray.length > availableSpace) {
            System.out.println("Not enough space to append array");
            return;
        }
        System.arraycopy(otherArray, 0, this.arr, this.size, otherArray.length);
        this.size += otherArray.length;
    }
    
    
    public int linearSearch(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    
   
    public void delete(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid index, cannot delete element");
            return;
        }
        for (int i = index; i < this.size - 1; i++) {
            this.arr[i] = this.arr[i+1];
        }
        this.arr[this.size - 1] = 0;
        this.size--;
    }
    
 
    public void replace(int index, int element) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid index, cannot replace element");
            return;
        }
        this.arr[index] = element;
    }
    
  
    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 >= this.size || index2 < 0 || index2 >= this.size) {
            System.out.println("Invalid index, cannot swap elements");
            return;
        }
        int temp = this.arr[index1];
       
  this.arr[index1] = this.arr[index2];
    this.arr[index2] = temp;
}


public void insert(int index, int element) {
    if (index < 0 || index > this.size || this.isFull()) {
        System.out.println("Invalid index or array is full, cannot insert element");
        return;
    }
    for (int i = this.size - 1; i >= index; i--) {
        this.arr[i+1] = this.arr[i];
    }
    this.arr[index] = element;
    this.size++;
}
 public static void main(String[] args) {
	 int maxsize = IBIO.inputInt("Enter array length: ");
	 MyArray myArray = new MyArray(maxsize);
for (int i = 1; i <= maxsize; i++){
myArray.add(IBIO.inputInt("Enter value "+ i +": "));
}
myArray.printPopulated();     
String answer = IBIO.input("Do you want to delete an index? (yes/no): ");
        if (answer.equalsIgnoreCase("yes")) {
            myArray.delete(IBIO.inputInt("What index do you want deleated? "));
			myArray.printPopulated(); 
        } else if (answer.equalsIgnoreCase("no")) {
          
        } else {
            System.out.println("Invalid input, please enter 'yes' or 'no'");
        }    
     String answer2 = IBIO.input("Do you want to replace an index? (yes/no): ");
        if (answer2.equalsIgnoreCase("yes")) {
            myArray.replace(IBIO.inputInt("What array index do you want replaced? "+1), IBIO.inputInt("What value do you want to replace it with? "));
myArray.printPopulated();
        } else if (answer2.equalsIgnoreCase("no")) {
          
        } else {
            System.out.println("Invalid input, please enter 'yes' or 'no'");
        }     
//myArray.swap();
//myArray.printPopulated();
//myArray.insert(1, 2);
//myArray.printPopulated(); 

	
}
}
