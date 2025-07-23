import java.util.Scanner;


public class EvenOrOdd{


	public static void main(String[] args){
	
	int value,number;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Value For Even Odd");
	value= sc.nextInt();
	
	evenOdd(value);
	
	
	
	
	
	
	
	
	
	}
	public static boolean evenOdd(int value){
	
	
		System.out.println((value % 2) == 0);
		return true;
		
		
	}	
}	
