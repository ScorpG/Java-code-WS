
public class IBIOQ41 {
	
	public static void main (String[] args) {
			int d = 0;
		do{
		int a = IBIO.inputInt("Enter the first number: ");
		int b = IBIO.inputInt("Enter the second number: ");
		int c = IBIO.inputInt("Press: [1] For Addition | [2] For Muliplicaton | [3] For Divison:");
		
		switch (c){
			case 1: 
			a = a+b;
			IBIO.output(a);
			d=d +3;
			break;
			case 2: 
			a = a *b;
			IBIO.output(a);
			d=d + 3;
			break;
			case 3:
			a = a/b;
			IBIO.output(a);
			d=d +3;
			break;
			default:
			IBIO.output("None of the avaliable options were chosen");
			break;
		}
		}while (d != 3);
		}
		
		
	}


