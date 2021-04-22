


class InterfaceDemo{
	public static void main(String[] args){
	
	Shape2d rect= new Rectangle();
	//Shape2d crl= new Circle();
	
	System.out.println("Area Of Rectangle " + rect.area());
	//System.out.println("Area Of Circle " + crl.area());
	
	
	}


}


interface Shape2d{


	public double area();
	
	


}

class Rectangle implements Shape2d{
	double length,width;
	
	
	Rectangle()
	{
		length = 0.0;
		width = 0.0;
	
	}

	public double area(){
		
		return  length * width;
		
		
	}
	

}


