public class IBIOQ72{

public static void main(String[] args) {
    double xx = 1;
    int num;
 
    for (int i = 0; i < 10; i++) {
        xx = xx * 3.732;
        String yy = "" + xx;
        int dc = yy.indexOf('.');
	num = dc;
   String cc = space(num);


        for (int j = num; j == 0; j--) {
            System.out.print(space(num));
        
       /// for (int j = num; j > dc; j--) System.out.print(space(num));
        
        }
        System.out.println(xx);
    }
}


static String space(int n) {
	String xx = "";
	for ( int i = 0; i <= n; i++)
		xx = xx + ".";
		return xx ; 
}
	
	
	

}
