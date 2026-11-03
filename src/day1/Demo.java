package day1;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		
		int age;					//memory occupied by variable age is 4 bytes
		double weight;				//memory occupied by variable age is 8 bytes
		

		int a=4;
		double b=a;		//widening is done implicitly (automatically)	
		
		System.out.println("INT " + a);
		System.out.println("DOUBLE " + b);
		
		
		double x=4.5;
		int y=(int)x;		//narrowing is done explicitly 
		System.out.println("-------------");
		System.out.println("INT " + y);
		System.out.println("DOUBLE " + x);
		
		
		int n=9;
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
			
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=sc.nextInt();  //m=7
		
		if(m%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}

//Scanner class is in util package
