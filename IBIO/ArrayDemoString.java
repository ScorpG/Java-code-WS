public class ArrayDemoString
{
	private final static int MAXSIZE = 10;
	private static int lastIndex = 0;
	
	public static boolean isFull()
	{
		return lastIndex == MAXSIZE;
	/*	if (size == MAXSIZE)
	 *		return true;
	 *	else
	 *		return false;
	 */
	}
	
	public boolean isEmpty()
	{
		return lastIndex == 0;
	}
	
	public static void printArray(String[] a)
	{
		//System.out.print( "Start -->");
		for(int i = 0; i < lastIndex; i++)
		{
			System.out.print( i + ":" + a[i] + "   ");
		}
		System.out.printf("\n\t[ %d elements in array ]\n", lastIndex);
	}
	
	public static void printWholeArray(String[] a)
	{
		System.out.print( "Start -->");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print( i + ":" + a[i] + "   ");
		}
		System.out.println();
	}
	
	public static void append(String[] a, String data)
	{
		if(isFull())
			System.out.println("Error - array full");
		else {
			a[lastIndex] = data;
			lastIndex++;
		}
		printArray(a);
	}
	
	// page 260 Big Java LO, 6.3.5
	public static int search(String[] a, String data)
	{
		for(int i = 0; i < lastIndex; i++)
		{
			if(a[i].equalsIgnoreCase(data) )
				return i;
		}
		return -1;
	}
	
	// page 260 Big Java LO, 6.3.5
	public static void remove(String[] a, String data)
	{
		int indexToRemove = search(a, data);
		if( indexToRemove == -1)
		{	System.out.printf("%s not found.\n", data);
		} else {
			// this for loop copies all the elements below the element to remove one index UP
			for(int i = indexToRemove; i < lastIndex-1; i++)
			{
				a[i] = a[i+1];
			}
			lastIndex--;
			printWholeArray(a);
		}
	}
	
	public static void insert(String[] a, String data, int index)
	{
		if( isFull() == true )
			System.out.println("Error - array full");
		else {
			lastIndex++;
			for(int i = lastIndex-1; i > index; i--)
			{	a[i] = a[i-1];
				printArray(a);
			}
			a[index] = data;
		}
		printWholeArray(a);
	}
	
	public static void main(String[] args)
	{
		String[] array = new String[MAXSIZE];
		printWholeArray(array);
		String[] original = { "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Dean", "StarLord", "Groot", "Steve", "Max" };
		for(String x : original)
		{	
			System.out.printf(" >>> Adding %s to array\n", x);
			append(array, x);
		}
		
		System.out.println("\nsearch for Anne: " + search(array, "Anne") );
		System.out.println("\nsearch for Dean: " + search(array, "Dean") );
		System.out.println("\nremove(array, \"bob\"):");
		remove(array, "bob");
		System.out.println("\nremove(array, \"Abe\"):");
		remove(array, "Abe");
		System.out.println("\nremove(array, \"groot\"):");
		remove(array, "groot");
		System.out.println("\nremove(array, \"James\"):");
		remove(array, "James");
		System.out.println("\ninsert(array, \"Diana\", 0);");
		insert(array, "Diana", 0);
		System.out.println("\ninsert(array, \"Bruce\", 4);");
		insert(array, "Bruce", 4);
		System.out.println("\ninsert(array, \"Alfred\", 9);");
		insert(array, "Alfred", 9);

	}
}
