public class IBIOSum
{

public static void main(String args[])
{
int sum = 0;
int n = IBIO.inputInt(" enter a number ");
do
{ int digit = n % 10; // get right most digit
sum = sum + digit; // add to units digits
n = n / 10; // make new number
} while ( n != 0);
IBIO.output("The sum of the digits of the number is " + sum);
}
}
