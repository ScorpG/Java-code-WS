public class IBIOPrime
{
public static void main(String args[])
{ int i = 1;
int x = IBIO.inputInt("Enter a number: ");
do
{ i++;
} while (x % i != 0);
IBIO.output(x + " is divisible by " + i);
}
}
