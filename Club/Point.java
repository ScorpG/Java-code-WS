
public class Point {
	
	char name; 
	double x; 
	double y; 
	
	// constructor (it builds points) 
	public Point(char pointname,double coordX, double coordY)
	{ 
		name = pointname;
		x = coordX;
		y = coordY;
		
	}
	public double distance(Point p2)
    {
       return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }
    
    public double distance()
    {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
	
	
	public void printPoint()
	{
		System.out.println(name + "(" + x + "," + y + ")");
	}
	
	public static void main (String[] args) 
	{
		Point p = new Point ('P', 8, 19);
		p.printPoint();
		Point q = new Point ('Q', 5, 7);
		q.printPoint();
		Point u = new Point ('U', 9, 25);
		u.printPoint();
		
		System.out.println(p.equals(q));
        System.out.println(q.equals(p));
        
     System.out.println(p.distance(q));
     System.out.println(u.distance(p));
}
}

