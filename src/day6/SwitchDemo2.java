package day6;

import java.util.Scanner;

public class SwitchDemo2 {

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
		
		switch(choice)
		{
		case 1:	 System.out.println("Call routed to London"); break;
		case 2 : System.out.println("Call routed to Delhi"); break;
		case 3 : System.out.println("Call routed to Pune"); break;
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

