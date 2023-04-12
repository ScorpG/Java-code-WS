import java.util.Arrays;

public class IBIOQ102{

    static boolean isBinary(String binary){
		
        char[] Array = binary.toCharArray();
        for (int i = 0; i < Array.length; i++){
			
            if (Array[i] != '0' && Array[i] != '1')
                return false;
        }
        return true;
    }

    static int power(int base, int exp){
		
        if (exp == 0)
            return 1;
        int power = 1;
        for (int i = 0; i < exp; i++)
        {
            power = power * base;
        }
        return power;
    }

    static int bin2int(String binary)
    {
        char[] Array = binary.toCharArray();
        int[] Values = new int[Array.length]; // or binary.length()
        int[] powersOf2 = new int[Array.length]; // or binary.length()
        // first we build an array with the powers of 2, for the positional
        // notation approach
        for (int i = 0; i < Array.length; i++)
        {
            powersOf2[Array.length-1-i] = power(2, i);
        }
        // second, we convert the char array into an int array (binValues)
        for(int i = 0; i < Array.length; i++)
        {
            if (Array[i] == '1')
                Values[i] = 1;
            else if(Array[i] == '0')
                Values[i] = 0;
        }
        System.out.println(Arrays.toString(powersOf2));
        System.out.println(Arrays.toString(Values));
        int total = 0;
        for(int i = 0; i < Values.length; i++)
        {
            total = total + (Values[i] * powersOf2[i]);
        }
        return total;
    }

    public static void main(String[] args){
        //System.out.println(power(2,8)); //testing
        //System.out.println(bin2int("1010")); //testing
        String binary = IBIO.input("Enter a binary number: ");
        if (!isBinary(binary))
        {
            System.out.println("Error - input is not a binary number");
        } else
        {
            System.out.println(bin2int(binary));
        }
    }

}







