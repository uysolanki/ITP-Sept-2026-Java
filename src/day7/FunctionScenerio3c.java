package day7;

import java.util.Scanner;

public class FunctionScenerio3c {

	public static void main(String[] args)   						//common man
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter width of rectangle");
		int width=sc.nextInt();										  						//buy
																							//call						
		System.out.println("Area of Rectangle is "+ areaOfRectangle(length,width));         //serve function call															
	}																						// function invoke
	
	public static int areaOfRectangle(int len,int wid)		//Honest Caterer  function body / function defination
	{
		return len*wid;										//cook
	}
	
	

	
	
}


































//public static int areaOfRectangle(int len,int wid)   function prototype
//1. function name
//2. count of parameters
//3. order of paramerters
//4. type of parameters
//5. return type
//6. access specefier/modifiers












