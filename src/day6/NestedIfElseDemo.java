package day6;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your HSC percentage");
		double hscPercentage=sc.nextDouble();  //0.00  -> 99.9
			
		if(hscPercentage>=75)					//		is	23.0 > 75 False
			System.out.println("DIST");
		else if(hscPercentage>=60)				//		is	23.0 > 60 False
			System.out.println("FC");			
		else if(hscPercentage>=50)				//		is	23.0 > 50 True
			System.out.println("SC");
		else if(hscPercentage>=35)				//		is	23.0 > 35 True
			System.out.println("PC");
		else
			System.out.println("Not Pass");	
		
		System.out.println("Thank You!!!");

	}

}
