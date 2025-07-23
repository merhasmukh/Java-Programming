import java.util.Scanner;


class MatrixOperations{

	public static void main(String args[]){
	
	int i,j,h1rows ,h1columns,h2rows,h2columns;
	double [][] h1 ;
	double [][] h2 ;
	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the nuber of rows for h1");
	h1rows = sc.nextInt();
	System.out.println("Enter the nuber of columns for h1");
	h1columns = sc.nextInt();
	
	System.out.println("Enter the nuber of rows for h2");
	h2rows = sc.nextInt();
	System.out.println("Enter the nuber of columns for h2");
	h2columns = sc.nextInt();
	
	
	System.out.println("Enter the Value for matrix h1:");
	h1 = new double[h1rows][h1columns];
	for(i=0;i<h1rows;i++)
	{
		for(j=0;j<h1columns;j++)
		{
			h1[i][j] = sc.nextDouble();
		
		}
		System.out.println("\n");
	
	}
	
	System.out.println("Enter the Value for matrix h2:");
	h2 = new double[h2rows][h2columns];
	for(i=0;i<h2rows;i++)
	{
		for(j=0;j<h2columns;j++)
		{
			h2[i][j] = sc.nextDouble();
		
		}
		System.out.println("\n");
	
	}
	
	
	Matrix m1  = new Matrix(h1);
	Matrix m2  = new Matrix(h2);
	
	Matrix add = m1.add(m2);
	Matrix sub = m1.sub(m2);
	Matrix mul = m1.Mul(m2);
	
	System.out.println(m1);
	
	System.out.println(m2);
		System.out.println("Addion of h1 and h2: \n");
	System.out.println(add);
	System.out.println("Substraction of h1 and h2: \n");
	System.out.println(sub);
	System.out.println("Multiplication Of M1 And M2:\n");
	System.out.println(mul);
	
	
	
	
	
	}




}



class Matrix{

	private int rows,columns;
	private double [][] data; 
	
	Matrix(){
	
		
		data = new double[rows][columns];
	}
	
	Matrix(int rows,int columns){
	
		this.rows=rows;
		this.columns=columns;
		data = new double[rows][columns];
	
	}
	Matrix(double [][] d){
		rows = d.length;
		columns = d[0].length;
		data = new double[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				data[i][j] = d[i][j];
			}
		}
		
		}
	public Matrix add(Matrix m){  // mxn  pxq    => m=p n=q  mxn
	
		Matrix h=null;
		if(rows==m.rows && columns==m.columns)
		{
			h = new Matrix(rows,columns);
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++){
					h.data[i][j] = data[i][j] + m.data[i][j];
				}
			}					
		}
		else{
			System.out.println("Addion not possible");
			}
		return h;
	}	
	
	public Matrix sub(Matrix m){  // mxn  pxq    => m=p n=q  
	
		Matrix h=null;
		if(rows==m.rows && columns==m.columns)
		{
			h = new Matrix(rows,columns);
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++){
					h.data[i][j] = data[i][j] - m.data[i][j];
				}
			}					
		}
		else{
			System.out.println("substrection not possible");
			}
		return h;
	}
	
	public Matrix Mul(Matrix m){
	
	Matrix h=null;
	
	if(m.rows==m.columns)
	{
		
		h = new Matrix(rows,columns);
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++){
					
					for(int k=0;k<columns;k++)
					{
						h.data[i][j] = data[i][j] * m.data[i][j];
					}
					
				}
			System.out.println("\n");
		
			}
		}
	else
	{
		System.out.println("Multiplication Not Possible..!!\n");
	}
     return h;	
	}
	public String toString(){
		String s="";
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
				s += data[i][j] + "\t";
			s += "\n";
		}
		return s;
		}		
}
