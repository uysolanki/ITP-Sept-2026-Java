package day6;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		//British Telecom
		//Lisa Hutchinson
		Scanner sc=new Scanner(System.in);
		System.out.println("**** Menu *****");
		System.out.println("1. English");
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");   //pls communicate in english and not in vernacular language
		System.out.println("0. Exit");
		
		System.out.println("Please enter your choice");
		int choice=sc.nextInt();
		
		if(choice==1)
			System.out.println("Call routed to London");
		else if(choice==2)
			System.out.println("Call routed to Delhi");
		else if(choice==3)
			System.out.println("Call routed to Pune");
		else if(choice==0)
		{
			System.out.println("Shutting down...");
			System.exit(0);
		}
		else
					System.out.println("Invalid Input");
		
			
		
		System.out.println("Thank You!!!");
		

	}

}

