


public class IBIOQ63 {
	
	public static void main(String[] args)
{ 
	int num = IBIO.inputInt("Enter number of lines: ");
	String aa = stars(num);
	String bb = starss(num);
	String cc = starsss(num);
	String dd = space(num);
	String ee = spacee(num);

	for (int u = num; u > 0; u--) IBIO.output(spacee(u) + stars(num));
	IBIO.output(starsss(num));
	for (int i = 0; i < num; i++) IBIO.output(space(i) + starss(num));


} 

	static String stars(int n) { 
		String xx = "";
	for ( int i = 0; i < n; i++)
		xx = xx + "*";
		return xx ; 
}

		static String starss(int n) {
			
		String xx = "";
	for ( int i = 0; i < n; i++)
		xx = xx + "*";
		return xx ;
			
		}
		
		
	static String starsss(int n) {
			
		String xx = "";
	for ( int i = 0; i < n; i++)
		xx = xx + "*";
		return xx ;

		}
		
	static String space(int n) {
			
		String xx = " ";
	for ( int i = 0; i < n; i++)
		xx = xx + " ";
		return xx ;

		}
	static String spacee(int n) {
			
		String xx = "";
	for ( int i = 0; i < n; i++)
		xx = xx + " ";
		return xx ;

		}
		
		
		
}

