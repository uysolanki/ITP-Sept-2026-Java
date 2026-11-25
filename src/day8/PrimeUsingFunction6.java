package day8;

import java.util.Scanner;

public class PrimeUsingFunction6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Number");
		int num=sc.nextInt();								//buy
		int ans=checkPrime(num);							//call
		
		System.out.println(ans==0?num +" is Prime":num+ " is Not Prime");			//serve
		
	}

	private static int checkPrime(int num) {
		for(int i=2;i<num;i++)
			if(num%i==0) return 1;
			
															
		return 0;											//cook
	}
}
