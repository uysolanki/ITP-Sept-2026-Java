package day7;

import java.util.Scanner;

public class PrimeUsingFunction1 {

	public static void main(String[] args) {
		checkPrime();
	}

	private static void checkPrime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int num=sc.nextInt();								//buy
		
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}	
		}													//cook
			
		if(flag==0)
			System.out.println("Prime");					//serve
		else
			System.out.println("Not Prime");
	}
}
