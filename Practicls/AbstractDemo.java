

class AbstractDemo{
	
	
	public static void main(String[] args){
	
	Shape2d rect= new Rectangle();
	Shape2d crl= new Circle();
	Shape2d trg = new Triangle();
	
	System.out.println("Area Of Rectangle " + rect.area());
	System.out.println("Area Of Circle " + crl.area());
	System.out.println("Area Of Triangle " + trg.area());
	System.out.println("circumference Of Rectangle " + rect.circumference());
	System.out.println("circumference Of Circle " + crl.circumference());
	System.out.println("circumference Of Triangle " + trg.circumference());
	
	
	}


}

abstract class Shape2d{


	double radius;
	double length;

	abstract double area();
	
	abstract double circumference();



}

class Rectangle extends Shape2d{
	double length,width;
	
	
	Rectangle()
	{
		length = 0.0;
		width = 0.0;
	
	}

	double area(){
		
		return  length * width;
		
		
	}
	double circumference(){
		
		return 2*(length+width);
		
	
	}



}
 

class Triangle extends Shape2d{
	int s1,s2,s3;
	double base;
	double height;
	
	Triangle(){
		
		base = 0.0;
		height =0.0;
		s1 = 0 ;
		s2 = 0;
		s3 = 0;
	
	}
	
	double area(){
		
		return (1/2)*(base*height);
	
	}
	double circumference(){
		
		return  s1+s2+s3;
	
	}
	
	


}


class Circle extends Shape2d{
	double radius;


	Circle()
	{
		radius = 0.0;
			
	}

	double area(){
		
		return  Math.PI * radius *radius;
		
		
	}
	double circumference(){
		
		return 2*Math.PI*radius;
		
	
	}





}
