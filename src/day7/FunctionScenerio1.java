package day7;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args)   						//Ambani
	{
		
		areaOfRectangle();				//call						//; function call   Ambani is calling 5* Hotel
																	//					main is calling areaOfRectangle
	}

	
	public static void areaOfRectangle()							//5 * Hotel
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter width of rectangle");
		int width=sc.nextInt();										//buy
		
		
		int area=length*width;										//cook
		
		System.out.println("Area of Rectangle is "+area);           //serve
	}
}
