public class Square 

{	
	
	//attrabuits
	char name; 
	double side; 
	
	//constructor
	public Square(char n, double s)
	{	
		name = n; 
		side = s;
	}
	
	//Method
	public double getArea()
	{
		double area = side * side; 
		return area; 
	}
	public double getPerimeter()
	{
		double perimeter = side * 4; 
		return perimeter; 
	}

}
