package day6;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		//British Telecom
		//Lisa Hutchinson
		Scanner sc=new Scanner(System.in);
		System.out.println("**** Menu *****");
		System.out.println("1. English");
		System.out.println("2. Arabic");
		System.out.println("0. Exit");
		
		System.out.println("Please enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:	 
					System.out.println("**** English Options *****");
					System.out.println("1. US");
					System.out.println("2. UK");
					System.out.println("3. Aus");
					System.out.println("0. Exit");
					
					System.out.println("Please enter your choice");
					choice=sc.nextInt();
					
					switch(choice)
					{
					case 1 : System.out.println("Call routed to New York"); break;
					case 2 : System.out.println("Call routed to London"); break;
					case 3 : System.out.println("Call routed to Sydney"); break;
					case 0 : System.exit(0);
					default : System.out.println("Invalid Input");
					}
					
		break;			
		case 2 : 
					System.out.println("**** Arabic Options *****");
					System.out.println("1. UAE");
					System.out.println("2. Qatar");
					System.out.println("3. Oman");
					System.out.println("0. Exit");
					
					System.out.println("Please enter your choice");
					choice=sc.nextInt();
					
					switch(choice)
					{
					case 1 : System.out.println("Call routed to Dubai"); break;
					case 2 : System.out.println("Call routed to Doha"); break;
					case 3 : System.out.println("Call routed to Muscat"); break;
					case 0 : System.exit(0);
					default : System.out.println("Invalid Input");
					}
			
		break;			
		case 0:  System.out.println("Shutting down...");
				 System.exit(0);
		default : System.out.println("Invalid Input");
		}
				
		System.out.println("Thank You!!!");
	}

}


//break - 		exit a loop/ case
//return - 		exits a function
//System.exit - exits the entire app

//1. Burger
//2. Fries
//3. Cold drink
//0. exit

