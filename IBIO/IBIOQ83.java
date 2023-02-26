


public class IBIOQ83 {
	
	public static void main (String[] args) {
	
for (int a = 1; a < 100; a++) {
for (int b = 1; b < 100; b++) {
int c = (int) Math.sqrt(a * a + b * b);
if (c * c == a * a + b * b && c < 100) {
System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
}
}
}
}
}
