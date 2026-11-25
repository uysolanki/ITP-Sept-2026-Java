package day7;

import java.util.Scanner;

public class PrimeUsingFunction3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Number");
		int num=sc.nextInt();								//buy
		int ans=checkPrime(num);							//call
		if(ans==0)
			System.out.println(num +" is Prime");					//serve
		else
			System.out.println(num+ " is Not Prime");
	}

	private static int checkPrime(int num) {
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}	
		}													//cook
			
		return flag;
	}
}
