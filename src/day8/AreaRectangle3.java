package day8;

import java.util.Scanner;

public class AreaRectangle3 {

	public static void main(String[] args)   						  //common man
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter width of rectangle");
		int width=sc.nextInt();										  //buy
		boolean result=areaOfRectangle(length,width);					  //call						
		System.out.println(result? "Big room": "Small room");           //serve															
	}
	
	public static boolean areaOfRectangle(int len,int wid)				  //10,8
	{
		int area=len*wid;										     //80
		
		return area>=100;
			
	}
	
	

	
	
}
