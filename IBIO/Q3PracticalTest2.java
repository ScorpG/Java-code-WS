public class Q3PracticalTest2 {

    // global variables and constants
    final static int MAXSIZE = 10;
    static int population = 0;

    public static boolean isFull(String[] a) {
        return population == MAXSIZE;
    }

    public static boolean isEmpty(String[] a) {
        return population == 0;
    }

    public static void printArray(String[] a) {
        for (int i = 0; i < population; i++) {
            System.out.print(i + ":" + a[i] + "   ");
        }
        System.out.printf("\n\t[ %d elements in array ]\n", population);
    }

    public static void printWholeArray(String[] a) {
        System.out.print("Start -->");
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + i + "]" + ":" + a[i] + "   ");
        }
        System.out.printf("[ length: %d ]\n", a.length);
    }

    public static String[] clone(String[] a) {
        String[] copy = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        return copy;
    }

    public static void add(String[] a, String data) {
        if (isFull(a)) {
            System.out.println("Error: Array is full");
        } else {
            a[population] = data;
            population++;
        }
        printWholeArray(a);
    }

    public static int search(String[] a, String data) {
        for (int i = 0; i < population; i++) {
            if (a[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(String[] a, int index1, int index2) {
        String temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void replace(String[] a, String original, String replacement) {
        int indexToReplace = search(a, original);
        if (indexToReplace == -1) {
            System.out.printf("%s not found.\n", original);
        } else {
            a[indexToReplace] = replacement;
            printWholeArray(a);
        }
    }

    public static void remove(String[] a, String data) {
        int indexToRemove = search(a, data);
        if (indexToRemove == -1) {
            System.out.printf("%s not found.\n", data);
        } else {
            // this for loop copies all the elements below the element to remove one index UP
            for (int i = indexToRemove; i < population - 1; i++) {
                a[i] = a[i + 1];
            }
            population--;
            printWholeArray(a);
        }
    }

    public static void insert(String[] a, String data, int index) {
        if (isFull(a)) {
            System.out.println("Error: Array is full");
        } else {
            population++;
            for (int i = population - 1; i > index; i--) {
                a[i] = a[i - 1];
                printArray(a);
            }
            a[index] = data;
        }
        printWholeArray(a);
    }

    // Do not modify the code below this line--------------------------------------------------------------------------
    public static void main(String[] args)
    {
        String[] arr = new String[MAXSIZE];
        System.out.println("1. printWholeArray + length:\n   Expected output >>> 0:null  1:null  2:null  3:null  4:null  5:null  6:null  7:null  8:null  9:null  [ length: 10 ]");
        System.out.print("   Y O U R  output >>> "); printWholeArray(arr);
        System.out.println("\n2. printArray + population:\n   Expected output >>> [ population: 0 ]");
        System.out.print("   Y O U R  output >>> "); printArray(arr);
        System.out.println("\n3. Testing isFull()  method [false] >>> " + isFull(arr));
        System.out.println("   Testing isEmpty() method [true]  >>> " + isEmpty(arr));
        System.out.println("\n4. Testing the add() method...");
        add(arr, "apple");
        add(arr, "banana");
        add(arr, "cherry");
        add(arr, "dragonfruit");
        add(arr, "elderberry");
        add(arr, "fig");
        add(arr, "gooseberry");
        add(arr, "imbe");
        add(arr, "jujube");
        add(arr, "kiwi");
        System.out.print("   Output should be: Error adding longan >>> ");
        add(arr, "longan");
        System.out.println("   Expected output >>> 0:apple  1:banana  2:cherry  3:dragonfruit  4:elderberry  5:fig  6:gooseberry  7:imbe  8:jujube  9:kiwi  [ population: 10 ]");
        System.out.print("   Y O U R  output >>> ");
        printArray(arr);
        System.out.println("\n5. Test search(arr, \"banana\") method [1]: " + search(arr, "banana"));
        System.out.println("   Test search(arr, \"grape\") method [-1]: " + search(arr, "grape"));
        String[] full = clone(arr);
        System.out.println("\n6. Testing clone method String[] full = clone(arr); [false]: " + arr.equals(full));
        System.out.println("\n7. Testing remove(arr, \"dragonfruit\"); remove(arr, \"gooseberry\"); - output should be as below:");
        remove(arr, "dragonfruit");
        remove(arr, "gooseberry");
        System.out.print("   Testing remove(arr, \"watermelon\") should output error: watermelon not found >>> ");
        remove(arr, "watermelon");  
        System.out.println("8. Testing swap(arr, 0, 5);");
		swap(arr, 0, 5);
        System.out.println("   Testing swap(arr, 3, 10); swap(arr, -3, 1); this should generate two errors >>>");
        System.out.print("   "); swap(arr, 3, 10);
       System.out.print("   "); swap(arr, -3, 1);
        System.out.println("   Expected output >>> 0:fig  1:banana  2:cherry  4:elderberry  5:apple  7:imbe  8:jujube  9:kiwi  [ population: 8 ] (printArray)");
        System.out.print("   Y O U R  output >>> "); printArray(arr);
        System.out.println("\n9. Testing replace(arr, \"apple\", \"papaya\") ");
        replace(arr, "apple", "papaya");
        System.out.println("   Expected output >>> 0:fig  1:banana  2:cherry  3:null  4:elderberry  5:papaya  6:null  7:imbe  8:jujube  9:kiwi  [ length: 10 ] (printWholeArray)");
        System.out.print("   Y O U R  output >>> ");
        printWholeArray(arr);
        System.out.print("   Testing replace(arr, \"watermelon\", \"apple\") should output error: watermelon not found >>> ");
        replace(arr, "watermelon", "apple");
        System.out.println("\n10. Testing insert(arr, \"plum\", 0) ");
        insert(arr, "plum", 0);
        System.out.println("    Expected output >>> 0:plum  1:banana  2:cherry  3:fig  4:elderberry  5:papaya  6:null  7:imbe  8:jujube  9:kiwi  [ length: 10 ] (printWholeArray)");
        System.out.print("    Y O U R  output >>> ");
        printWholeArray(arr);
        System.out.print("    Testing insert(arr, \"mango\", 11) should output an error >>> ");
        insert(arr, "mango", 11);
        

    }
}
