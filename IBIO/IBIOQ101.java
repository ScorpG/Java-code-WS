public class IBIOQ101{

   public static void main(String args[])
   {
	String ss=IBIO.input("Enter your name: "); //inputyourname 
	char[] xx = ss.toCharArray(); //make into an array

      for (int i = 0; i < ss.length(); i++)
      {
         IBIO.out(xx [i]); }
         IBIO.output(" ");
   for (int c = ss.length()-1; c >= 0; c--){
	   IBIO.out(xx[c]); }
	    IBIO.output(" ");
	   for (int i = 0; i < ss.length(); i++)
      {
         IBIO.out(xx [i]); }
   for (int c = ss.length()-2; c >= 0; c--){
	   IBIO.out(xx[c]); }
	   
	   
	   
   }
         
         
         
}

