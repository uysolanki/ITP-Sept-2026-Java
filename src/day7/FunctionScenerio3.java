package day7;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args)   						//common man
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter width of rectangle");
		int width=sc.nextInt();										  //buy
		int result=areaOfRectangle(length,width);					  //call						
		System.out.println("Area of Rectangle is "+result);           //serve															
	}
	
	public static int areaOfRectangle(int len,int wid)				  //Honest Caterer
	{
		int area=len*wid;										//cook
		return area;
	}
	
	

	
	
}
