
import java.util.Arrays;
import java.util.Scanner;

public class PracTestQ3 {
    public static void main(String[] args) {
        int[] arr = {163, 491, 211, 5, 509, 17,
			313,197,7,31,97,4,131,223,463,331,107,59,
			293,227,337,461,191,233,277,71,109,241,61
			,29,503,367,449,89,431,389,139,269,263,47
			,349,257,67,2,11,251,227,457,193,383,359
			,379,83,173,409,239,151,311,13,113,443,419,
			281,181,487,53,103,179,43,479,149,199,19,
			283,307,23,439,271,373,167,73,421,101,401,
			37,353,521,433,41,523,499,347,127,157,3,
			79,467,229,397,137,317};

        Scanner scanner = new Scanner(System.in);

        // Repeat until valid input is entered
        int numLargest = 0, numSmallest = 0;
        do {
            numSmallest = IBIO.inputInt("Enter number of largest and smallest numbers to find (2-10): ");
            numLargest = numSmallest;
        } while (numLargest < 2 || numLargest > 10 || numSmallest < 2 || numSmallest > 10);


        // Traversing and processing the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);

        // Counting numbers above and below average
        int numAboveAvg = 0, numBelowAvg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                numAboveAvg++;
            } else if (arr[i] < avg) {
                numBelowAvg++;
            }
        }
        System.out.println("Number of elements above average: " + numAboveAvg);
        System.out.println("Number of elements below average: " + numBelowAvg);

        // Finding largest and smallest numbers
        Arrays.sort(arr);
        int[] largest = new int[numLargest];
        int[] smallest = new int[numSmallest];
        for (int i = arr.length - 1, j = 0; i >= arr.length - numLargest; i--, j++) {
            largest[j] = arr[i];
        }
        for (int i = 0; i < numSmallest; i++) {
            smallest[i] = arr[i];
        }
        System.out.println("Largest " + numLargest + " elements: " + Arrays.toString(largest));
        System.out.println("Smallest " + numSmallest + " elements: " + Arrays.toString(smallest));

        // Checking if array contains unique elements
        boolean unique = isUnique(arr);
        System.out.println("Array contains unique elements: " + unique);

        // Finding minimum and maximum values
        int[] minMax = findMinMax(arr);
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);
    }

    public static int[] findMinMax(int[] arr) {
        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result[0]) {
                result[0] = arr[i];
            }
            if (arr[i] > result[1]) {
                result[1] = arr[i];
            }
        }
        return result;
    }  public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
	}}
