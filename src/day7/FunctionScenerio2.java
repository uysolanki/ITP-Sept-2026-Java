package day7;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static int areaOfRectangle()							//Honest Caterer
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter width of rectangle");
		int width=sc.nextInt();										//buy
		
		
		int area=length*width;										//cook
		
		return area;
	}
	
	public static void main(String[] args)   						//common man
	{
		
		int result=areaOfRectangle();								  //call						
		System.out.println("Area of Rectangle is "+result);           //serve															
	}

	
	
}
