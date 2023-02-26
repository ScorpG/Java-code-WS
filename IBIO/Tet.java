public class Tet
{

public static void main(String args[])
{
int sum = 0;
int n = IBIO.inputInt("Enter a number: ");
do
{ int digit = n % 10; // get right most digit
	digit = digit * digit * digit;
sum = sum + digit; // add to units digits
n = n / 10; // make new number

} while ( n != 0);
IBIO.output("The sum of the digits of the number is " + sum);
}
}
