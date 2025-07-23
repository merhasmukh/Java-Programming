
import java.awt.*;





 

 class Circle{
 
 

	private int x,y;
	private Point center = new Point(x,y);
	private double radius;
	
	
	
	Circle()
	{
		this.radius = 0;
		this.center = new Point(0,0);
	
	}
	
	public Circle(double radius)
	{ 
        	this.radius = radius;
        	this.center = new Point(0,0); 
    	}

    	public Circle(Point center)
    	{ 
        	this.center = new Point(x,y);  
    	} 

    	public Circle(double radius, Point center)
    	{
    	
		this.radius =radius ; 
		 this.center = center ; 
    	}
	
	
	
	public double Area(){
	
		return Math.PI* radius * radius;
	
	}
	
	public static void main(String[] args){

	
	
	Circle c1 = new Circle(10);

	System.out.println("Area Of The Circle" + " - " +c1.Area());
 	
 	
 	
 	
 	


	}
	
	
	
	 
	
}
